package entity.organism.animal.herbivore;

import entity.organism.Organism;
import entity.organism.plant.Plant;

import java.util.List;

public class Horse extends Herbivore {

    public double weight = 400.0;

    public void starve() {
        --weight;
        if(this.weight < 340) {
            isAlive = false;
        }
    }

    @Override
    public void eat(Organism organism) {
        if (organism.getClass().equals(Plant.class)) {
            Plant plant = (Plant) organism;
            this.weight = this.weight + plant.weight;
        }
    }

}
