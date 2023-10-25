package org.javarush.vitaliy.island.entity.oraganism.plants;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.vitaliy.island.abstraction.annotations.Config;
import org.javarush.vitaliy.island.abstraction.annotations.GameObjectEntity;
import org.javarush.vitaliy.island.abstraction.interfaces.GameEntity;


@GameObjectEntity
@Config(fileName = "config/entities/plants/cactus.yaml")
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Cactus extends Plant implements GameEntity {


    public Cactus reproduce() {
        return Cactus.builder()
                .limits(getLimits())
                .icon(getIcon())
                .lastReproductionYear(getLastReproductionYear()).
                isEaten(getIsEaten())
                .build();
    }

//    @Override
//    public void setGameObjectCell(Cell cell) {
//
//    }
//
//    @Override
//    public String getGameObjectIcon() {
//        return null;
//    }
}
