package entity;

import config.Settings;
import entity.organism.animal.herbivore.*;
import entity.organism.animal.predator.*;
import entity.organism.plant.Plant;
import utill.PlantGrowth;

import java.util.ArrayList;
import java.util.List;

public class Location implements Runnable {

    PlantGrowth plantGrowth = new PlantGrowth();

    List<Plant> plants = new ArrayList<>();

    List<Boar> boars = new ArrayList<>();

    List<Buffalo> buffaloes = new ArrayList<>();

    List<Caterpillar> caterpillars = new ArrayList<>();

    List<Deer> deer = new ArrayList<>();

    List<Duck> ducks = new ArrayList<>();

    List<Goat> goats = new ArrayList<>();

    List<Horse> horses = new ArrayList<>();

    List<Mouse> mice = new ArrayList<>();

    List<Rabbit> rabbits = new ArrayList<>();

    List<Sheep> sheep = new ArrayList<>();

    List<Bear> bears = new ArrayList<>();

    List<Boa> boas = new ArrayList<>();

    List<Eagle> eagles = new ArrayList<>();

    List<Fox> foxes = new ArrayList<>();

    List<Wolf> wolves = new ArrayList<>();

    public Location() {

        for (int i = 0; i < Settings.plantCount; i++) {
            plants.add(new Plant());
        }
        for (int i = 0; i < Settings.boarCount; i++) {
            boars.add(new Boar());
        }
        for (int i = 0; i < Settings.buffaloCount; i++) {
            buffaloes.add(new Buffalo());
        }
        for (int i = 0; i < Settings.caterpillarCount; i++) {
            caterpillars.add(new Caterpillar());
        }
        for (int i = 0; i < Settings.deerCount; i++) {
            deer.add(new Deer());
        }
        for (int i = 0; i < Settings.duckCount; i++) {
            ducks.add(new Duck());
        }
        for (int i = 0; i < Settings.goatCount; i++) {
            goats.add(new Goat());
        }
        for (int i = 0; i < Settings.horseCount; i++) {
            horses.add(new Horse());
        }
        for (int i = 0; i < Settings.mouseCount; i++) {
            mice.add(new Mouse());
        }
        for (int i = 0; i < Settings.rabbitCount; i++) {
            rabbits.add(new Rabbit());
        }
        for (int i = 0; i < Settings.sheepCount; i++) {
            sheep.add(new Sheep());
        }
        for (int i = 0; i < Settings.bearCount; i++) {
            bears.add(new Bear());
        }
        for (int i = 0; i < Settings.boaCount; i++) {
            boas.add(new Boa());
        }
        for (int i = 0; i < Settings.eagleCount; i++) {
            eagles.add(new Eagle());
        }
        for (int i = 0; i < Settings.foxCount; i++) {
            foxes.add(new Fox());
        }
        for (int i = 0; i < Settings.wolfCount; i++) {
            wolves.add(new Wolf());
        }



    }

    @Override
    public void run() {
        plantGrowth.grow(plants);
        System.out.println(plants.size());
    }
}
