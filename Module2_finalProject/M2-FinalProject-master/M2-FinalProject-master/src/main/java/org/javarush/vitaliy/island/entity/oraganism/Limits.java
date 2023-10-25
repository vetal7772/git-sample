package org.javarush.vitaliy.island.entity.oraganism;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@SuperBuilder
@Getter
@EqualsAndHashCode
@ToString
public class Limits {
    private int maxWeight;
    private int maxAmount;
    private int maxSpeed;
    private int maxFood;
   // private int maxAge; // TODO: add maxAge to config files
}
