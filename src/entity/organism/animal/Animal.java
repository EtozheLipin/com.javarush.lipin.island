package entity.organism.animal;

import entity.Location;
import entity.organism.Organism;
import repository.AnimalFactory;


public abstract class Animal extends Organism {

    AnimalFactory animalFactory = new AnimalFactory();

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

   public Animal reproduce() {
return animalFactory.createNewAnimal(this);
    }

    public void starve() {
        --weight;
        if (weight < minWeight) {
            this.isAlive = false;
        }
    }
}