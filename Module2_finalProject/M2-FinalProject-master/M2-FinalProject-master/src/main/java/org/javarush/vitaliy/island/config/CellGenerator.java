package org.javarush.vitaliy.island.config;

import lombok.Getter;
import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.javarush.vitaliy.island.entity.map.Cell;
import org.javarush.vitaliy.island.factory.GameObjectPrototypeFactory;
import org.javarush.vitaliy.island.factory.PrototypeFactory;

public class CellGenerator {

    //private static final PrototypeFactory<GameObject> prototypeFactory = GameObjectPrototypeFactory.getInstance();

    private final GameObjectGenerator gameObjectGenerator = GameObjectGenerator.getInstance();

    @Getter
    private static final CellGenerator instance = new CellGenerator();

    private CellGenerator() {
    }


public Cell createCell() {
    Cell cell = Cell.builder().build();
    cell.setResidents(gameObjectGenerator.generateGameObjects(cell));
    //System.out.println(cell.getResidents()); // print all residents in cell
    return cell;
}

    public Cell[][] createCells(int width, int height) {
        Cell[][] cells = new Cell[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                cells[i][j] = createCell();
            }
        }
        return cells;
    }
}