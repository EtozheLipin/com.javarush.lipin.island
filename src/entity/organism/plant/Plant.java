package entity.organism.plant;

import entity.organism.Organism;

import java.util.ArrayList;
import java.util.List;


public class Plant extends Organism {

    public double weight = 1.0;

    public static void grow(List<Plant> plants) {
        if (plants.isEmpty()) {
            plants.add(new Plant());
        } else {
            List<Plant> newPlants = new ArrayList<>();
            for (Plant plant : plants) {
                newPlants.add(new Plant());
            }

            plants.addAll(newPlants);

            if (plants.size() > 200) {
                int temp = plants.size() - 200;
                for (int i = 0; i < temp; i++) {
                    plants.remove(0);
                }
            }
        }
    }
}