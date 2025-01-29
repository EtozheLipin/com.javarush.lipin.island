package entity.organism.animal.predator;

import entity.Location;
import entity.organism.animal.Animal;

import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Predator {


    public Bear(double weight, double minWeight) {
        super(weight, minWeight);
    }

    @Override
    public void eat(Location location) {
        Animal prey = location.animals.get(ThreadLocalRandom.current().nextInt(location.animals.size()));
        int probability;
        if (prey.getClass().equals(this.getClass())) {
            return;
        }
        switch (prey.getClass().getSimpleName()) {
            case "Boa", "Deer", "Rabbit", "Mouse":
                probability = 80;
                break;
            case "Horse":
                probability = 40;
                break;
            case "Goat", "Sheep":
                probability = 70;
                break;
            case "Boar":
                probability = 50;
                break;
            case "Buffalo":
                probability = 20;
                break;
            case "Duck":
                probability = 10;
                break;
            default:
                probability = 0;
        }
        if(prey.isAlive && ThreadLocalRandom.current().nextInt(100) < probability) {
            this.weight = this.weight + prey.weight;
            prey.isAlive = false;
        }

    }
}
