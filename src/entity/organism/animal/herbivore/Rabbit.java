package entity.organism.animal.herbivore;

public class Rabbit extends Herbivore{


    public Rabbit(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 150;
        this.speed = 2;
    }
}
