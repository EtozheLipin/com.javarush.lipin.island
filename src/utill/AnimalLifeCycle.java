package utill;

import entity.Island;
import entity.Location;
import entity.organism.animal.Animal;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalLifeCycle {

    Location location;

    public AnimalLifeCycle(Location location) {
        this.location = location;
    }

    public void activity(List<Animal> animalList, Island island) {
        if (!animalList.isEmpty()) {
            for (Animal animal : animalList) {
                animal.eat(location);
            }

            for (Animal animal : animalList) animal.starve();

            animalList.removeAll(animalList.stream().filter(animal -> animal.isAlive == false).toList());
            location.plants.removeAll(location.plants.stream().filter(plant -> plant.isAlive == false).toList());

            List<Animal> newAnimals = new ArrayList<>();

            for (Animal animal : animalList) {
                Animal otherAnimal = animalList.get(ThreadLocalRandom.current().nextInt(animalList.size()));
                if (animal.getClass().getSimpleName().equals(otherAnimal.getClass().getSimpleName()) && !animal.equals(otherAnimal)) {
                    if(ThreadLocalRandom.current().nextInt(100) > 50) {
                        newAnimals.add(animal.reproduce());
                    }
                }
            }

            for (Animal newAnimal : newAnimals) {
                if (newAnimal.maxQuantity > animalList.stream().filter(animal -> animal.getClass().getSimpleName().equals(newAnimal.getClass().getSimpleName())).toList().size()) {
                    animalList.add(newAnimal);
                }
            }
            for (Animal animal : animalList) {
                    animal.move(island, location);
            }

        }
    }

}
