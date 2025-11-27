package net.h4bbo.echo.storage.seeding;

import net.h4bbo.echo.storage.StorageContext;
import net.h4bbo.echo.storage.models.room.RoomData;

public abstract class SeedProvider<T> {

    /**
     * The entity class this provider seeds.
     */
    public abstract Class<T> getEntityClass();

    /**
     * Checks whether records already exist for this entity type.
     */
    public boolean hasData(StorageContext context) {
        try {
            return context.from(this.getEntityClass()).count() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Creates or prepares schema for this entity type.
     */
    public void prepare(StorageContext context) throws Exception {
        try {
            context.dropTableIfExists(this.getEntityClass());
        } catch (Exception e) {

        }

        try {
            context.createTable(this.getEntityClass());
        } catch (Exception e) {

        }
    }

    /**
     * Performs the actual seeding.
     */
    public abstract void seed(StorageContext context) throws Exception;
}
