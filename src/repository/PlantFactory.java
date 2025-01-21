package repository;

import entity.organism.plant.Plant;

public class PlantFactory {

    public static Plant createPlant() {
        return new Plant();
    }
}
