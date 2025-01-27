package entity.organism.animal.herbivore;


import entity.Location;
import entity.organism.animal.Animal;
import entity.organism.plant.Plant;


public class Herbivore extends Animal {

    @Override
    public void eat(Location location) {
        if (!location.plants.isEmpty()) {
            for (Plant plant : location.plants) {
                if (plant.isAlive) {
                    this.weight = this.weight + plant.weight;
                    plant.isAlive = false;
                    break;
                }

            }
        }
    }
}
