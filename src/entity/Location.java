package entity;

import entity.organism.animal.herbivore.Horse;
import entity.organism.plant.Plant;
import utill.Settings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Location implements Runnable {

    List<Plant> plants = new ArrayList<>();
    List<Horse> horses = new ArrayList<>();

    public Location() {
        for (int i = 0; i < Settings.plantCount; i++) {
            plants.add(new Plant());
        }
        for (int i = 0; i < Settings.horseCount; i++) {
            horses.add(new Horse());
        }
    }

    @Override
    public void run() {
        if (plants.isEmpty()) {
            plants.add(new Plant());
        }
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(3); i++) {
            plants.add(plants.get(ThreadLocalRandom.current().nextInt(plants.size())).grow());
        }
        if (plants.size() > 200) {
            int temp = plants.size() - 200;
            for (int i = 0; i < temp; i++) {
                plants.remove(0);
            }
        }
            // Ростения выросли
            for (Horse horse : horses) {
                if (plants.isEmpty()) {
                    break;
                }
                Plant plantToEat = plants.get(ThreadLocalRandom.current().nextInt(plants.size()));
                horse.eat(plantToEat);
                plants.remove(plantToEat);
            }
        // Лошади покушали
        for (Horse horse : horses) {
            horse.starve();
        }
        if (!horses.isEmpty()) {
            List<Horse> deadHorses = new ArrayList<>();
            for (Horse horse : horses) {
                horse.starve();
                if (!horse.isAlive) {
                    deadHorses.add(horse);
                }
            }
            horses.removeAll(deadHorses);
        }
        // Лошади голодают

        System.out.println("Растений на клетке: " + plants.size());
        System.out.println("\uD83D\uDC0E: " + horses.size());

    }
}
