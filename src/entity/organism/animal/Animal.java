package entity.organism.animal;

import entity.organism.Organism;

public abstract class Animal extends Organism {

    double weight;

    public void eat(Organism organism) {
        System.out.println("Ам ням");
    }

    public void starve() {
        --weight;
    }

    public void move() {
        System.out.println("Топ-топ-топ");
    }

    public Animal reproduce(Animal animal) {
        return null;
    }

}
