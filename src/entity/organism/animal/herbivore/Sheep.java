package entity.organism.animal.herbivore;

public class Sheep extends Herbivore{


    public Sheep(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 140;
        this.speed = 3;
    }
}
