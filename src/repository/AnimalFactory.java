package repository;

import config.Settings;
import entity.organism.animal.Animal;
import entity.organism.animal.herbivore.*;
import entity.organism.animal.predator.*;

public class AnimalFactory {

    public Animal createNewAnimal(Animal animal) {
        switch (animal.getClass().getSimpleName()) {
            case "Boar":
                return new Boar(Settings.boarWeight, Settings.boarMinWeight);
            case "Buffalo":
                return new Buffalo(Settings.buffaloWeight, Settings.buffaloMinWeight);
            case "Caterpillar":
                return new Caterpillar(Settings.caterpillarWeight, Settings.caterpillarMinWeight);
            case "Deer":
                return new Deer(Settings.deerWeight, Settings.deerMinWeight);
            case "Duck":
                return new Duck(Settings.duckWeight, Settings.duckMinWeight);
            case "Goat":
                return new Goat(Settings.goatWeight, Settings.goatMinWeight);
            case "Horse":
                return new Horse(Settings.horseWeight, Settings.horseMinWeight);
            case "Mouse":
                return new Mouse(Settings.mouseWeight, Settings.mouseMinWeight);
            case "Rabbit":
                return new Rabbit(Settings.rabbitWeight, Settings.rabbitMinWeight);
            case "Sheep":
                return new Sheep(Settings.sheepWeight, Settings.sheepMinWeight);
            case "Bear":
                return new Bear(Settings.bearWeight, Settings.bearMinWeight);
            case "Boa":
                return new Boa(Settings.boaWeight, Settings.boaMinWeight);
            case "Eagle":
                return new Eagle(Settings.eagleWeight, Settings.eagleMinWeight);
            case "Fox":
                return new Fox(Settings.foxWeight, Settings.foxMinWeight);
            case "Wolf":
                return new Wolf(Settings.wolfWeight, Settings.wolfMinWeight);
            default:
                return null;
        }
    }

}
