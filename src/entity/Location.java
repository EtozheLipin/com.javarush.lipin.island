package entity;

import config.Settings;
import entity.organism.animal.Animal;
import entity.organism.animal.herbivore.*;
import entity.organism.animal.predator.*;
import entity.organism.plant.Plant;
import utill.AnimalLifeCycle;
import utill.PlantGrowth;
import utill.PrintStatistics;

import java.util.ArrayList;
import java.util.List;

public class Location implements Runnable {
    AnimalLifeCycle animalLifeCycle = new AnimalLifeCycle(this);
    PlantGrowth plantGrowth = new PlantGrowth();
    public List<Plant> plants = new ArrayList<>();
    public List<Animal> animals = new ArrayList<>();
    PrintStatistics statistics = new PrintStatistics(plants, animals);


    public Location() {

        for (int i = 0; i < Settings.plantCount; i++) {
            plants.add(new Plant());
        }
        for (int i = 0; i < Settings.wolfCount; i++) {
            animals.add(new Wolf(Settings.wolfWeight, Settings.wolfMinWeight));
        }
        for (int i = 0; i < Settings.boaCount; i++) {
            animals.add(new Boa(Settings.boaWeight, Settings.boaMinWeight));
        }
        for (int i = 0; i < Settings.foxCount; i++) {
            animals.add(new Fox(Settings.foxWeight, Settings.foxMinWeight));
        }
        for (int i = 0; i < Settings.bearCount; i++) {
            animals.add(new Bear(Settings.bearWeight, Settings.bearMinWeight));
        }
        for (int i = 0; i < Settings.eagleCount; i++) {
            animals.add(new Eagle(Settings.eagleWeight, Settings.eagleMinWeight));
        }
        for (int i = 0; i < Settings.horseCount; i++) {
            animals.add(new Horse(Settings.horseWeight, Settings.horseMinWeight));
        }
        for (int i = 0; i < Settings.deerCount; i++) {
            animals.add(new Deer(Settings.deerWeight, Settings.deerMinWeight));
        }
        for (int i = 0; i < Settings.rabbitCount; i++) {
            animals.add(new Rabbit(Settings.rabbitWeight, Settings.rabbitMinWeight));
        }
        for (int i = 0; i < Settings.mouseCount; i++) {
            animals.add(new Mouse(Settings.mouseWeight, Settings.mouseMinWeight));
        }
        for (int i = 0; i < Settings.goatCount; i++) {
            animals.add(new Goat(Settings.goatWeight, Settings.goatMinWeight));
        }
        for (int i = 0; i < Settings.sheepCount; i++) {
            animals.add(new Sheep(Settings.sheepWeight, Settings.sheepMinWeight));
        }
        for (int i = 0; i < Settings.boarCount; i++) {
            animals.add(new Boar(Settings.boarWeight, Settings.boarMinWeight));
        }
        for (int i = 0; i < Settings.buffaloCount; i++) {
            animals.add(new Buffalo(Settings.buffaloWeight, Settings.buffaloMinWeight));
        }
        for (int i = 0; i < Settings.duckCount; i++) {
            animals.add(new Duck(Settings.duckWeight, Settings.duckMinWeight));
        }
        for (int i = 0; i < Settings.caterpillarCount; i++) {
            animals.add(new Caterpillar(Settings.caterpillarWeight, Settings.caterpillarMinWeight));
        }


    }

    @Override
    public void run() {
        plantGrowth.grow(plants);

        animalLifeCycle.activity(animals);


        statistics.printStat();
    }
}
