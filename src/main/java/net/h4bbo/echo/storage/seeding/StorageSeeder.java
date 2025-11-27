package net.h4bbo.echo.storage.seeding;

import net.h4bbo.echo.storage.StorageContext;
import org.oldskooler.simplelogger4j.SimpleLog;

import java.util.ArrayList;
import java.util.List;

public final class StorageSeeder {
    private static final SimpleLog logger = SimpleLog.of(StorageSeeder.class);

    private static final List<SeedProvider<?>> PROVIDERS = new ArrayList<>();

    private StorageSeeder() {}

    public static <T> void register(SeedProvider<T> provider) {
        PROVIDERS.add(provider);
    }

    public static void init(StorageContext context) {
        for (SeedProvider<?> provider : PROVIDERS) {

            seedSingleProvider(context, provider);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> void seedSingleProvider(StorageContext context, SeedProvider<T> provider) {
        Class<T> type = provider.getEntityClass();
        String name = type.getSimpleName();

        try {
            provider.prepare(context);

            if (provider.hasData(context)) {
                logger.debug(name + " table already seeded");
                return;
            }

            provider.seed(context);

            logger.debug(name + " table has been seeded");

        } catch (Exception ex) {
            logger.error("Error occurred while seeding " + name + ":", ex);
        }
    }
}
