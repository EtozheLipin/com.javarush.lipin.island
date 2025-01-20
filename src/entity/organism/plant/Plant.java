package entity.organism.plant;

import entity.organism.Organism;



public class Plant extends Organism {

   public double weight = 1.0;

   public Plant grow() {
       return new Plant();
   }
}
