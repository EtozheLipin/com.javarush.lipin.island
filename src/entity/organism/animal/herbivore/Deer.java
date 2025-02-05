package entity.organism.animal.herbivore;

public class Deer extends Herbivore{


    public Deer(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 20;
        this.speed = 4;
    }
}
