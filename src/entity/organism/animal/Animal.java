package entity.organism.animal;

import entity.Location;
import entity.organism.Organism;



public abstract class Animal extends Organism {

    public int weight;

    public void eat(Location location) {

    }

    void move() {

    }

    void reproduce() {

    }


    void starve() {
        --weight;
    }
}
