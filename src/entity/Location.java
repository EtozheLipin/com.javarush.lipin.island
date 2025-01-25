package entity;

import config.Settings;
import entity.organism.animal.Animal;
import entity.organism.animal.herbivore.*;
import entity.organism.animal.predator.*;
import entity.organism.plant.Plant;
import utill.PlantGrowth;
import utill.PrintStatistics;

import java.util.ArrayList;
import java.util.List;

public class Location implements Runnable {

    PlantGrowth plantGrowth = new PlantGrowth();
   public List<Plant> plants = new ArrayList<>();
   public List<Animal> animals = new ArrayList<>();
    PrintStatistics statistics = new PrintStatistics(plants, animals);


    public Location() {

        for (int i = 0; i < Settings.plantCount; i++) {
            plants.add(new Plant());
        }
        for (int i = 0; i < Settings.wolfCount; i++) {
            animals.add(new Wolf());
        }
        for (int i = 0; i < Settings.boaCount; i++) {
            animals.add(new Boa());
        }
        for (int i = 0; i < Settings.foxCount; i++) {
            animals.add(new Fox());
        }
        for (int i = 0; i < Settings.bearCount; i++) {
            animals.add(new Bear());
        }
        for (int i = 0; i < Settings.eagleCount; i++) {
            animals.add(new Eagle());
        }
        for (int i = 0; i < Settings.horseCount; i++) {
            animals.add(new Horse());
        }
        for (int i = 0; i < Settings.deerCount; i++) {
            animals.add(new Deer());
        }
        for (int i = 0; i < Settings.rabbitCount; i++) {
            animals.add(new Rabbit());
        }
        for (int i = 0; i < Settings.mouseCount; i++) {
            animals.add(new Mouse());
        }
        for (int i = 0; i < Settings.goatCount; i++) {
            animals.add(new Goat());
        }
        for (int i = 0; i < Settings.sheepCount; i++) {
            animals.add(new Sheep());
        }
        for (int i = 0; i < Settings.boarCount; i++) {
            animals.add(new Boar());
        }
        for (int i = 0; i < Settings.buffaloCount; i++) {
            animals.add(new Buffalo());
        }
        for (int i = 0; i < Settings.duckCount; i++) {
            animals.add(new Duck());
        }
        for (int i = 0; i < Settings.caterpillarCount; i++) {
            animals.add(new Caterpillar());
        }


    }

    @Override
    public void run() {
        plantGrowth.grow(plants);

        statistics.printStat();
    }
}
