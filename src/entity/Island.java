package entity;

import config.Settings;
import entity.organism.animal.herbivore.*;
import entity.organism.animal.predator.*;

public class Island implements Runnable {

    public Location[][] map = new Location[Settings.x][Settings.y];

    public void getInfo() {
        int plantsCount = 0;
        int wolfsCount = 0;
        int boaCount = 0;
        int foxCount = 0;
        int bearCount = 0;
        int eagleCount = 0;
        int horseCount = 0;
        int deerCount = 0;
        int rabbitCount = 0;
        int mouseCount = 0;
        int goatCount = 0;
        int sheepCount = 0;
        int boarCount = 0;
        int buffaloCount = 0;
        int duckCount = 0;
        int caterpillarCount = 0;
        for (Location[] locations : map) {
            for (Location location : locations) {
                plantsCount = plantsCount + location.plants.size();
                wolfsCount = wolfsCount + location.animals.stream().filter(animal -> animal.getClass().equals(Wolf.class)).toArray().length;
                boaCount = boaCount + location.animals.stream().filter(animal -> animal.getClass().equals(Boa.class)).toArray().length;
                foxCount = foxCount + location.animals.stream().filter(animal -> animal.getClass().equals(Fox.class)).toArray().length;
                bearCount = bearCount + location.animals.stream().filter(animal -> animal.getClass().equals(Bear.class)).toArray().length;
                eagleCount = eagleCount + location.animals.stream().filter(animal -> animal.getClass().equals(Eagle.class)).toArray().length;
                horseCount = horseCount + location.animals.stream().filter(animal -> animal.getClass().equals(Horse.class)).toArray().length;
                deerCount = deerCount + location.animals.stream().filter(animal -> animal.getClass().equals(Deer.class)).toArray().length;
                rabbitCount = rabbitCount + location.animals.stream().filter(animal -> animal.getClass().equals(Rabbit.class)).toArray().length;
                mouseCount = mouseCount + location.animals.stream().filter(animal -> animal.getClass().equals(Mouse.class)).toArray().length;
                goatCount = goatCount + location.animals.stream().filter(animal -> animal.getClass().equals(Goat.class)).toArray().length;
                sheepCount = sheepCount + location.animals.stream().filter(animal -> animal.getClass().equals(Sheep.class)).toArray().length;
                boarCount = boarCount + location.animals.stream().filter(animal -> animal.getClass().equals(Boar.class)).toArray().length;
                buffaloCount = buffaloCount + location.animals.stream().filter(animal -> animal.getClass().equals(Buffalo.class)).toArray().length;
                duckCount = duckCount + location.animals.stream().filter(animal -> animal.getClass().equals(Duck.class)).toArray().length;
                caterpillarCount = caterpillarCount + location.animals.stream().filter(animal -> animal.getClass().equals(Caterpillar.class)).toArray().length;

            }
        }
        System.out.print("Растений " + plantsCount + "  ");
        System.out.print(" \uD83D\uDC3A " + wolfsCount + "  ");
        System.out.print(" \uD83D\uDC0D " + boaCount + "  ");
        System.out.print(" \uD83E\uDD8A " + foxCount + "  ");
        System.out.print(" \uD83D\uDC3B " + bearCount + "  ");
        System.out.print(" \uD83E\uDD85 " + eagleCount + "  ");
        System.out.print(" \uD83D\uDC0E " + horseCount + "  ");
        System.out.print(" \uD83E\uDD8C " + deerCount + "  ");
        System.out.print(" \uD83D\uDC07 " + rabbitCount + "  ");
        System.out.print(" \uD83D\uDC01 " + mouseCount + "  ");
        System.out.print(" \uD83D\uDC10 " + goatCount + "  ");
        System.out.print(" \uD83D\uDC11 " + sheepCount + "  ");
        System.out.print(" \uD83D\uDC17 " + boarCount + "  ");
        System.out.print(" \uD83D\uDC03 " + buffaloCount + "  ");
        System.out.print(" \uD83E\uDD86 " + duckCount + "  ");
        System.out.print(" \uD83D\uDC1B " + caterpillarCount + "  ");
        System.out.println();
    }

    @Override
    public void run() {
        getInfo();
    }
}
