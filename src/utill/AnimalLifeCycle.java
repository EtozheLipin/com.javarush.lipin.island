package utill;

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

    public void activity(List<Animal> animalList) {
        if (!animalList.isEmpty()) {
            for (Animal animal : animalList) {
                animal.eat(location);
            }

            for (Animal animal : animalList) animal.starve();

            animalList.removeAll(animalList.stream().filter(animal -> animal.isAlive == false).toList());
            location.plants.removeAll(location.plants.stream().filter(plant -> plant.isAlive == false).toList());

            List<Animal> newAnimals = new ArrayList<>();

            for (Animal animal : animalList) {
                if(animal.getClass().getSimpleName().equals(animalList.get(ThreadLocalRandom.current().nextInt(animalList.size())).getClass().getSimpleName())) {
                   newAnimals.add(animal.reproduce());
                }
            }

            for (Animal newAnimal : newAnimals) {
                if(newAnimal.maxQuantity > animalList.stream().filter(animal -> animal.getClass().getSimpleName().equals(newAnimal.getClass().getSimpleName())).toList().size()){
                    animalList.add(newAnimal);
                }
            }

        }
    }

}
