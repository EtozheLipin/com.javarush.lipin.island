package entity.organism.animal;

import entity.Location;
import entity.organism.Organism;

import java.util.concurrent.ThreadLocalRandom;


public abstract class Animal extends Organism {

    public int weight;

    public void eat(Location location) {
        Animal animal = location.animals.get(ThreadLocalRandom.current().nextInt(location.animals.size()));
        this.weight = this.weight + animal.weight;
        animal.isAlive = false;

    }

    void move() {

    }

    void reproduce() {

    }


    void starve() {
        --weight;
    }
}
