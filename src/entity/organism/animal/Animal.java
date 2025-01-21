package entity.organism.animal;

import entity.organism.Organism;

import java.util.List;

public abstract class Animal extends Organism {

    public boolean isAlive = true;

    double weight;

    public void eat(Organism organism) {

    }

    public void starve() {
        --weight;
    }

    public void move() {
        System.out.println("Топ-топ-топ");
    }

    public Animal reproduce(List<Animal> animals) {
        return null;
    }

}
