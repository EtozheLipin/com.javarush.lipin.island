package entity.organism.animal.predator;

import entity.Location;
import entity.organism.animal.Animal;
import entity.organism.animal.herbivore.Herbivore;


import java.util.concurrent.ThreadLocalRandom;



public class Predator extends Animal {

    @Override
    public void eat(Location location) {
        Animal animal = location.animals.get(ThreadLocalRandom.current().nextInt(location.animals.size()));
        if(animal instanceof Herbivore) {
         this.weight = this.weight + animal.weight;
         animal.isAlive = false;
        }
    }
}
