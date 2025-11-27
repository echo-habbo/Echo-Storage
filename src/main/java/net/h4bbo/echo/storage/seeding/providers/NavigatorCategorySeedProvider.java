package net.h4bbo.echo.storage.seeding.providers;

import net.h4bbo.echo.storage.StorageContext;
import net.h4bbo.echo.storage.models.navigator.NavigatorCategoryData;
import net.h4bbo.echo.storage.seeding.SeedProvider;

public class NavigatorCategorySeedProvider extends SeedProvider<NavigatorCategoryData> {
    @Override
    public Class<NavigatorCategoryData> getEntityClass() {
        return NavigatorCategoryData.class;
    }

    @Override
    public void seed(StorageContext context) throws Exception {
        NavigatorCategoryData category;

        category = new NavigatorCategoryData();
        category.setName("Public Rooms");
        category.setId(3);
        category.setOrderId(0);
        context.insert(category);

        category = new NavigatorCategoryData();
        category.setName("Guest Rooms");
        category.setId(4);
        category.setOrderId(0);
        context.insert(category);

        category = new NavigatorCategoryData();
        category.setName("Swimming Pools");
        category.setId(5);
        category.setOrderId(0);
        category.setParentId(3);
        context.insert(category);

        category = new NavigatorCategoryData();
        category.setName("Test");
        category.setId(6);
        category.setOrderId(0);
        category.setParentId(5);
        context.insert(category);


        category = new NavigatorCategoryData();
        category.setName("Chill & Chat Rooms");
        category.setId(7);
        category.setParentId(4);
        category.setOrderId(0);
        context.insert(category);
    }
}
