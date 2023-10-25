package org.javarush.vitaliy.island.entity.map;

import lombok.*;
import org.javarush.vitaliy.island.abstraction.annotations.Config;

@Getter
@Setter
@NoArgsConstructor
@Config(fileName = "config/entities/map/map.yaml")
@ToString
public class GameMap {
    @Setter
    @Getter
    private static GameMap instance;

    private int width;
    private int height;
    @Setter
    private Cell[][] cells;



}
