package org.javarush.vitaliy.island.entity.oraganism.animals.predator;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.vitaliy.island.abstraction.annotations.Config;
import org.javarush.vitaliy.island.abstraction.annotations.GameObjectEntity;
import org.javarush.vitaliy.island.abstraction.interfaces.AnimalBehaviour;
import org.javarush.vitaliy.island.abstraction.interfaces.GameEntity;

@GameObjectEntity
@Config(fileName = "config/entities/animals/predator/bear.yaml")
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Bear extends Predator implements GameEntity, AnimalBehaviour {

    @Override
    public Bear reproduce() {
        return Bear.builder()
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
