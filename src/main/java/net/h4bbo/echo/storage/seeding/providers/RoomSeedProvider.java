package net.h4bbo.echo.storage.seeding.providers;

import net.h4bbo.echo.storage.StorageContext;
import net.h4bbo.echo.storage.models.room.RoomData;
import net.h4bbo.echo.storage.seeding.SeedProvider;

public class RoomSeedProvider extends SeedProvider<RoomData> {
    @Override
    public Class<RoomData> getEntityClass() {
        return RoomData.class;
    }

    @Override
    public void seed(StorageContext context) throws Exception {
        RoomData room;

        room = new RoomData();
        room.setName("Welcome Lounge");
        room.setDescription("welcome_lounge");
        room.setModel("newbie_lobby");
        room.setCcts("hh_room_nlobby");
        room.setVisitorsNow(2);
        room.setVisitorsMax(25);
        room.setCategoryId(3);
        context.insert(room);


        room = new RoomData();
        room.setName("Cafe Ole");
        room.setDescription("cafe_ole");
        room.setModel("taivas_cafe");
        room.setCcts("hh_room_cafe");
        room.setCategoryId(3);
        context.insert(room);

        room = new RoomData();
        room.setName("Theatredome");
        room.setDescription("theatredrome");
        room.setModel("theater");
        room.setCcts("hh_room_theater");
        room.setVisitorsNow(0);
        room.setCategoryId(3);
        context.insert(room);

        room = new RoomData();
        room.setName("Habbo Lido");
        room.setDescription("habbo_lido");
        room.setVisitorsNow(0);
        room.setModel("pool_a");
        room.setCcts("hh_room_pool,hh_people_pool");
        room.setVisitorsMax(25);
        room.setCategoryId(5);
        context.insert(room);


        room = new RoomData();
        room.setName("Habbo Lido II");
        room.setDescription("habbo_lido");
        room.setVisitorsNow(0);
        room.setModel("pool_b");
        room.setCcts("hh_room_pool,hh_people_pool");
        room.setVisitorsMax(25);
        room.setCategoryId(5);
        context.insert(room);



        room = new RoomData();
        room.setName("Alex's Room");
        room.setDescription("random room description");
        room.setModel("model_b");
        room.setVisitorsNow(0);
        room.setVisitorsMax(25);
        room.setCategoryId(4);
        room.setOwnerId(1);
        context.insert(room);

        room = new RoomData();
        room.setName("Another Testing Room");
        room.setDescription("so i herd u liek mudkipz");
        room.setModel("model_a");
        room.setVisitorsNow(0);
        room.setVisitorsMax(25);
        room.setCategoryId(7);
        room.setOwnerId(1);
        context.insert(room);
    }
}
