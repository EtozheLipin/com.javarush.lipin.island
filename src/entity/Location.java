package entity;

import entity.organism.plant.Plant;
import utill.Settings;

import java.util.ArrayList;
import java.util.List;

public class Location implements Runnable {

    List<Plant> plants = new ArrayList<>();

    public Location() {
        for (int i = 0; i < Settings.plantCount; i++) {
            plants.add(new Plant());
        }
    }

    @Override
    public void run() {

        System.out.println("Растений на острове: "+plants.size());

    }
}
