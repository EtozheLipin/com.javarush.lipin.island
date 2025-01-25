package entity.organism.animal;

import entity.Location;
import entity.organism.Organism;
import entity.organism.animal.herbivore.Herbivore;


public abstract class Animal extends Organism {

   public int weight;

  public boolean isAlive = true;

  public void eat(Location location) {

   }

    void move() {

    }

    void reproduce() {

    }



    void starve() {
        --weight;
    }
}
