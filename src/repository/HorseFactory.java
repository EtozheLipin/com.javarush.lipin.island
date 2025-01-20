package repository;

import entity.organism.animal.herbivore.Horse;

public class HorseFactory {

    public static Horse createHorse() {
        return new Horse();
    }

}
