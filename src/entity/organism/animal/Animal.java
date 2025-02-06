package entity.organism.animal;

import entity.Island;
import entity.Location;
import entity.organism.Organism;
import repository.AnimalFactory;

import java.util.concurrent.ThreadLocalRandom;


public abstract class Animal extends Organism {

    public int speed;

    public int maxQuantity = 20;

    AnimalFactory animalFactory = new AnimalFactory();

    public Animal(double weight, double minWeight) {
        this.weight = weight;
        this.minWeight = minWeight;
    }

    public double weight;

    public double minWeight;

    public void eat(Location location) {

    }

   public void move(Island island, Location location) {
            Location newLocation;
            int moveX = location.x;
            int moveY = location.y;
            int xShift;
            int yShift;
            if (ThreadLocalRandom.current().nextInt(2) > 1) {
                xShift = 1;
            } else {
                xShift = -1;
            }
            if (ThreadLocalRandom.current().nextInt(2) > 1) {
                yShift = 1;
            } else {
                yShift = -1;
            }
            try {
                newLocation = island.map[moveX + xShift][moveY + yShift];
            } catch (ArrayIndexOutOfBoundsException e) {
                return;
            }
            newLocation.animals.add(animalFactory.createNewAnimal(this));
            this.isAlive = false;

    }

   public Animal reproduce() {
return animalFactory.createNewAnimal(this);
    }

    public void starve() {
        --weight;
        if (weight < minWeight) {
            this.isAlive = false;
        }
    }

}