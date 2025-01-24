package entity.organism.animal;

import entity.organism.Organism;

public abstract class Animal extends Organism {

    int weight;

    void move() {

    }

    void reproduce() {

    }

    void die() {

    }

    void starve() {
        --weight;
    }
}
