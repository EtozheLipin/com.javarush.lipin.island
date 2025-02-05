package entity.organism.animal.herbivore;

public class Horse extends Herbivore{

    public Horse(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 20;
        this.speed = 4;
    }
}
