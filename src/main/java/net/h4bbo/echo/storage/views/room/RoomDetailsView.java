package net.h4bbo.echo.storage.views.room;

import io.netty.util.AttributeKey;
import lombok.*;
import org.oldskooler.entity4j.annotations.Column;
import org.oldskooler.entity4j.annotations.Entity;
import org.oldskooler.entity4j.annotations.Id;

import java.time.LocalDateTime;

@Entity(table = "vw_room_details")
@ToString
@EqualsAndHashCode
public class RoomDetailsView {
    public static final AttributeKey<RoomDetailsView> DATA_KEY = AttributeKey.valueOf(RoomDetailsView.class.getCanonicalName());

    @Getter
    @Id(auto = true)
    private int id;

    @Getter
    @Setter
    @Column(name = "owner_id")
    private Integer ownerId;

    @Getter
    @Setter
    @Column(name = "category_id")
    private int categoryId;

    @Getter
    @Setter
    @Column(name = "name", nullable = false, defaultValue = "''")
    private String name;

    @Getter
    @Setter
    @Column(name = "owner_name", ignore = true)
    private String ownerName;

    @Getter
    @Setter
    @Column(name = "description", nullable = false, defaultValue = "''")
    private String description;

    @Getter
    @Setter
    @Column(name = "model", nullable = false, defaultValue = "'model_a'")
    private String model;

    @Getter
    @Setter
    @Column(name = "ccts")
    private String ccts;

    @Getter
    @Setter
    @Column(name = "visitors_now", nullable = false, defaultValue = "0")
    private int visitorsNow;

    @Getter
    @Setter
    @Column(name = "visitors_max", nullable = false, defaultValue = "25")
    private int visitorsMax;

    @Getter
    @Setter
    @Column(name = "created_at", nullable = false, defaultValue = "(CURRENT_TIMESTAMP)")
    private LocalDateTime createdAt;
}
