package org.javarush.vitaliy.island.config;

import lombok.Getter;
import org.javarush.vitaliy.island.entity.map.Cell;
import org.javarush.vitaliy.island.entity.map.GameMap;

public class GameMapGenerator {

    @Getter
    private static final GameMapGenerator instance = new GameMapGenerator();
    public final CellGenerator cellGenerator = CellGenerator.getInstance();
    private final PrototypeFactory prototypeFactory = PrototypeFactory.getInstance();

    private GameMapGenerator() {
    }

    public GameMap createGameMap() {
        GameMap gameMap = prototypeFactory.loadPrototype(GameMap.class);
        Cell[][] cells = cellGenerator.createCells(gameMap.getWidth(), gameMap.getHeight());
        mapCells(cells);
        gameMap.setCells(cells);
        return gameMap;
    }


    private void mapCells(Cell[][] cells) {
        int numRows = cells.length;
        int numCols = cells[0].length;

        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numCols; column++) {
                Cell currentCell = cells[row][column];

                if (column + 1 < numCols) {
                    currentCell.setNextCell(cells[row][column + 1]); // Сусід справа
                }
                if (row + 1 < numRows) {
                    currentCell.setNextCell(cells[row + 1][column]); // Сусід знизу
                }
                if (column - 1 >= 0) {
                    currentCell.setNextCell(cells[row][column - 1]); // Сусід зліва
                }
                if (row - 1 >= 0) {
                    currentCell.setNextCell(cells[row - 1][column]); // Сусід зверху
                }
            }
        }
    }
}

//    private void mapCells(Cell[][] cells) {
//        int numRows = cells.length;
//        int numCols = cells[0].length;
//
//        for (int row = 0; row < cells.length; row++) {
//            for (int column = 0; column < cells[row].length; column++) {
//
//                Cell currentCell = cells[row][column];
//
//                Cell rightCell = null;
//                Cell bottomCell = null;
//
//                if (column < cells[row].length - 1){
//                    rightCell = cells[row][column+1];
//                }
//
//                if (row < cells.length - 1){
//                    bottomCell = cells[row+1][column];
//                }
//
//                if (rightCell!=null){
//                    currentCell.setNext(rightCell);
//                    rightCell.setNext(currentCell);
//                }
//
//                if (bottomCell!=null){
//                    currentCell.setNext(bottomCell);
//                    bottomCell.setNext(currentCell);
//                }
//        }
//    }
//}


