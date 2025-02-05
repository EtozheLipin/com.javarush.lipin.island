package entity.organism.animal.predator;

import entity.Location;
import entity.organism.animal.Animal;

import java.util.concurrent.ThreadLocalRandom;

public class Eagle extends Predator {


    public Eagle(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 20;
        this.speed = 3;
    }

    @Override
    public void eat(Location location) {
        Animal prey = location.animals.get(ThreadLocalRandom.current().nextInt(location.animals.size()));
        int probability;
        if (prey.getClass().equals(this.getClass())) {
            return;
        }
        switch (prey.getClass().getSimpleName()) {
            case "Fox":
                probability = 10;
                break;
            case "Rabbit", "Mouse":
                probability = 90;
                break;
            case "Duck":
                probability = 80;
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
