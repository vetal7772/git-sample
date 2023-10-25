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
@Config(fileName = "config/entities/animals/herbivore/deer.yaml")
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Deer extends Herbivore implements GameEntity, AnimalBehaviour {
    @Override
    public Deer reproduce() {
        return Deer.builder()
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
