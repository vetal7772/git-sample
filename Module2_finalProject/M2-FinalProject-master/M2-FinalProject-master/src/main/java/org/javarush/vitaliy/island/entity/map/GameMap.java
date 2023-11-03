package org.javarush.vitaliy.island.entity.map;

import lombok.*;
import org.javarush.vitaliy.island.abstraction.annotations.Config;

@Getter
@Setter
@NoArgsConstructor
@Config(fileName = "config/entities/map/map.yaml")
@ToString
public class GameMap {
    private int width;
    private int height;
    private Cell[][] cells;

//    @Setter
//    @Getter
    private static GameMap instance;

    public static GameMap getInstance() {
        return instance;
    }

    public static void setInstance(GameMap instance) {
        GameMap.instance = instance;
    }
}
