package org.javarush.vitaliy.island.entity.map;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

@Getter
@Setter
@Builder
public class Cell {
    private static long serialUID = 1L;

    @Getter
    @Setter
    private Map<Class<? extends GameObject>, Set<GameObject>> residents;

    @Builder.Default
    private final long UID = serialUID++;
    /**
     * Lock for threads synchronization.
     */
    @Builder.Default
    private final ReentrantLock lock = new ReentrantLock();


    private final List<Cell> nextCells = new ArrayList<>();
    private Cell currentCell;

    public void setNextCell(Cell cell) {
        nextCells.add(cell);
    }
}