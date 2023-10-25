package org.javarush.vitaliy.island.entity.oraganism.animals.herbivore;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.vitaliy.island.abstraction.annotations.Config;
import org.javarush.vitaliy.island.abstraction.annotations.GameObjectEntity;
import org.javarush.vitaliy.island.abstraction.interfaces.AnimalBehaviour;
import org.javarush.vitaliy.island.abstraction.interfaces.GameEntity;

@GameObjectEntity
@Config(fileName = "config/entities/animals/herbivore/horse.yaml")
@NoArgsConstructor
@SuperBuilder()
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Horse extends Herbivore implements GameEntity, AnimalBehaviour {
    @Override
    public Horse reproduce() {
        return Horse.builder()
                .limits(getLimits())
                .icon(getIcon())
                .stringTargetMatrix(getStringTargetMatrix())
                .famine(getLimits().getMaxFood())
                .isAlive(getIsAlive())
                .reproductionProbability(getReproductionProbability())
                .hungerDecreased(getHungerDecreased())
                .build();
    }
}

//public class Horse extends Herbivore {
//
//    @Override
//    public GameObject reproduce() {
//        return Horse.builder()
//                .limits(getLimits())
//                .icon(getIcon())
//                .stringTargetMatrix(getStringTargetMatrix())
//                .famine(getLimits().getMaxFood())
//                .reproductionProbability(getReproductionProbability())
//                .hungerDecreased(getHungerDecreased())
//                .isAlive(getIsAlive())
//                .build();
//    }
//
//}