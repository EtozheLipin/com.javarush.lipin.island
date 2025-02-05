package entity.organism.animal.herbivore;

public class Goat extends Herbivore{


    public Goat(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 140;
        this.speed = 3;
    }
}
