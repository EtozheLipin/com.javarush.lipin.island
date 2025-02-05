package entity.organism.animal.herbivore;

public class Buffalo extends Herbivore{


    public Buffalo(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 10;
        this.speed = 3;
    }
}
