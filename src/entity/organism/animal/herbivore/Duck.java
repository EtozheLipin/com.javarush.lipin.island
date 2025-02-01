package entity.organism.animal.herbivore;

public class Duck extends Herbivore{


    public Duck(double weight, double minWeight) {
        super(weight, minWeight);
        this.maxQuantity = 200;
    }
}
