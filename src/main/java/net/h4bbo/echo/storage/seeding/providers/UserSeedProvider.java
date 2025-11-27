package net.h4bbo.echo.storage.seeding.providers;

import net.h4bbo.echo.storage.StorageContext;
import net.h4bbo.echo.storage.models.user.UserData;
import net.h4bbo.echo.storage.seeding.SeedProvider;

public class UserSeedProvider extends SeedProvider<UserData> {
    @Override
    public Class<UserData> getEntityClass() {
        return UserData.class;
    }

    @Override
    public void seed(StorageContext context) throws Exception {
        UserData admin = new UserData();
        admin.setName("Alex");
        admin.setPassword("123");
        admin.setFigure("1000118001270012900121001");
        admin.setSex("F");
        admin.setMotto("");
        admin.setCredits(9999);
        admin.setTickets(100);
        admin.setFilm(100);
        admin.setRank(7);

        context.insert(admin);
    }
}
