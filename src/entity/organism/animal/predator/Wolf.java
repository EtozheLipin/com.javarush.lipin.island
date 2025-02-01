package entity.organism.animal.predator;

import entity.Location;
import entity.organism.animal.Animal;

import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Predator {


    public Wolf(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 30;
    }

    @Override
    public void eat(Location location) {
        Animal prey = location.animals.get(ThreadLocalRandom.current().nextInt(location.animals.size()));
        int probability;
        if (prey.getClass().equals(this.getClass())) {
            return;
        }
        switch (prey.getClass().getSimpleName()) {
            case "Horse", "Buffalo":
                probability = 10;
                break;
            case "Deer", "Boar":
                probability = 15;
                break;
            case "Rabbit", "Goat":
                probability = 60;
                break;
            case "Mouse":
                probability = 80;
                break;
            case "Sheep":
                probability = 70;
                break;
            case "Duck":
                probability = 40;
                break;
            default:
                probability = 0;
        }
        if (prey.isAlive && ThreadLocalRandom.current().nextInt(100) < probability) {
            this.weight = this.weight + prey.weight;
            prey.isAlive = false;
        }

    }

}
