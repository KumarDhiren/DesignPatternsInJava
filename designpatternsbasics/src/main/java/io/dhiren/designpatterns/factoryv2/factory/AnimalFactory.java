package io.dhiren.designpatterns.factoryv2.factory;

import io.dhiren.designpatterns.factoryv2.animals.Animal;
import io.dhiren.designpatterns.factoryv2.animals.AnimalType;
import io.dhiren.designpatterns.factoryv2.animals.Elephant;
import io.dhiren.designpatterns.factoryv2.animals.Tiger;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType type) {
        switch (type) {
            case VEGETARIAN: {
                return new Elephant();
            }
            case NON_VEGETARIAN: {
                return new Tiger();
            }
            default:
                return null;
        }
    }
}
