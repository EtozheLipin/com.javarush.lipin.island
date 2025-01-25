package entity.organism.animal.herbivore;


import entity.Location;
import entity.organism.animal.Animal;
import entity.organism.plant.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class Herbivore extends Animal {

    @Override
    public void eat(Location location) {
        Plant plant = location.plants.get(ThreadLocalRandom.current().nextInt(location.plants.size()));
        this.weight = this.weight+ plant.weight;
        location.plants.remove(plant);
    }
}
