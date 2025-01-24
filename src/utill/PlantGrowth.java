package utill;

import entity.organism.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class PlantGrowth {

    public void grow(List<Plant> plants) {
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
