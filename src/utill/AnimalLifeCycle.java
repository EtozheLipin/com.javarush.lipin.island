package utill;

import entity.Location;
import entity.organism.animal.Animal;
import entity.organism.animal.herbivore.Herbivore;
import entity.organism.animal.predator.Predator;
import entity.organism.plant.Plant;

import java.util.List;
import java.util.function.Predicate;

public class AnimalLifeCycle {

    Location location;

    public AnimalLifeCycle(Location location) {
        this.location = location;
    }

    public void activity(List<Animal> animalList) {
        if (!animalList.isEmpty()) {
            for (Animal animal : animalList) {
                animal.eat(location);
            }
            animalList.removeAll(animalList.stream().filter(animal -> animal.isAlive == false).toList());
            location.plants.removeAll(location.plants.stream().filter(plant -> plant.isAlive == false).toList());
        }
    }

}
