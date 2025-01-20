package entity.organism.animal.herbivore;

import entity.organism.Organism;
import entity.organism.animal.Animal;
import entity.organism.plant.Plant;

public abstract class Herbivore extends Animal {

    double weight;
    @Override
    public void eat(Organism organism) {
        Plant plant = (Plant) organism;
        this.weight = this.weight + plant.weight;
    }
}
