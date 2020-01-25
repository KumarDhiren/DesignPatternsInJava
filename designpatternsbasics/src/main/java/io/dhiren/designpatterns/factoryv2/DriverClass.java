package io.dhiren.designpatterns.factoryv2;

import io.dhiren.designpatterns.factoryv2.animals.Animal;
import io.dhiren.designpatterns.factoryv2.animals.AnimalType;
import io.dhiren.designpatterns.factoryv2.factory.AnimalFactory;

public class DriverClass {
    public static void main(String[] args) {
        Animal vegetarian = AnimalFactory.getAnimal(AnimalType.VEGETARIAN);
        vegetarian.whoAmI();
        Animal nonvegetarian = AnimalFactory.getAnimal(AnimalType.NON_VEGETARIAN);
        nonvegetarian.whoAmI();
    }
}
