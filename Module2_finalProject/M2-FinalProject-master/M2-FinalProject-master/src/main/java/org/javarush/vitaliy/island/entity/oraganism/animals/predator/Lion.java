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
@Config(fileName = "config/entities/animals/predator/lion.yaml")
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Lion extends Predator implements GameEntity, AnimalBehaviour {
    @Override
    public Lion reproduce() {
        return Lion.builder()
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
