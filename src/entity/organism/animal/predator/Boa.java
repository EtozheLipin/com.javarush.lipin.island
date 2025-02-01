package entity.organism.animal.predator;

import entity.Location;
import entity.organism.animal.Animal;

import java.util.concurrent.ThreadLocalRandom;

public class Boa extends Predator {


    public Boa(double weight, double minWeight) {
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
            case "Fox":
                probability = 15;
                break;
            case "Rabbit":
                probability = 20;
                break;
            case "Mouse":
                probability = 40;
                break;
            case "Duck":
                probability = 10;
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
