package utill;

import entity.organism.animal.Animal;
import entity.organism.animal.herbivore.*;
import entity.organism.animal.predator.*;
import entity.organism.plant.Plant;

import java.util.List;

public class PrintStatistics {
    List<Plant> plantList;
    List<Animal> animalList;

    public PrintStatistics(List<Plant> plantList, List<Animal> animalList) {
        this.plantList = plantList;
        this.animalList = animalList;
    }

    public void printStat() {
        System.out.print("Растений: " + plantList.size());
        System.out.print(" Волков "+animalList.stream().filter(animal -> animal.getClass().equals(Wolf.class)).toArray().length);
        System.out.print(" Удавов "+animalList.stream().filter(animal -> animal.getClass().equals(Boa.class)).toArray().length);
        System.out.print(" Лис "+animalList.stream().filter(animal -> animal.getClass().equals(Fox.class)).toArray().length);
        System.out.print(" Медведей "+animalList.stream().filter(animal -> animal.getClass().equals(Bear.class)).toArray().length);
        System.out.print(" Орлов "+animalList.stream().filter(animal -> animal.getClass().equals(Eagle.class)).toArray().length);
        System.out.print(" Лошадей "+animalList.stream().filter(animal -> animal.getClass().equals(Horse.class)).toArray().length);
        System.out.print(" Оленей "+animalList.stream().filter(animal -> animal.getClass().equals(Deer.class)).toArray().length);
        System.out.print(" Кроликов "+animalList.stream().filter(animal -> animal.getClass().equals(Rabbit.class)).toArray().length);
        System.out.print(" Мышей "+animalList.stream().filter(animal -> animal.getClass().equals(Mouse.class)).toArray().length);
        System.out.print(" Коз "+animalList.stream().filter(animal -> animal.getClass().equals(Goat.class)).toArray().length);
        System.out.print(" Овец "+animalList.stream().filter(animal -> animal.getClass().equals(Sheep.class)).toArray().length);
        System.out.print(" Кабанов "+animalList.stream().filter(animal -> animal.getClass().equals(Boar.class)).toArray().length);
        System.out.print(" Буйволов "+animalList.stream().filter(animal -> animal.getClass().equals(Buffalo.class)).toArray().length);
        System.out.print(" Уток "+animalList.stream().filter(animal -> animal.getClass().equals(Duck.class)).toArray().length);
        System.out.print(" Гусениц "+animalList.stream().filter(animal -> animal.getClass().equals(Caterpillar.class)).toArray().length);
        System.out.println();
    }

}
