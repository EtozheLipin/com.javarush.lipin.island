package entity.organism.animal.predator;

import entity.organism.animal.Animal;



public class Predator extends Animal {
    public Predator(double weight, double minWeight) {
        super(weight, minWeight);
    }

    @Override
    public void starve() {
        super.starve();
    }
}
