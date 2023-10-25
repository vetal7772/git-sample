package org.javarush.vitaliy.island.abstraction.interfaces;

import org.javarush.vitaliy.island.entity.map.Cell;
import org.javarush.vitaliy.island.entity.oraganism.Limits;

public interface GameObject extends Reproducible {
    void play();
    Limits getLimits();
    void setGameObjectCell(Cell cell);
    Cell getCell();
    String getGameObjectIcon();


}
