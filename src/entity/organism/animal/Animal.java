package entity.organism.animal;

import entity.Location;
import entity.organism.Organism;


public abstract class Animal extends Organism {

    public Animal(double weight, double minWeight) {
        this.weight = weight;
        this.minWeight = minWeight;
    }

    public double weight;

    public double minWeight;

    public void eat(Location location) {

    }

    void move() {

    }

    void reproduce() {

    }

    public void starve() {
        --weight;
        if (weight < minWeight) {
            this.isAlive = false;
        }
    }
}