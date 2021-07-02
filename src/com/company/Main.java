package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//    Animal frog = new Animal(
//            4,
//            "small",
//            false,
//            "Raul",
//            2.0
//    );
//
//    Cat cat = new Cat(
//            4,
//            "medium",
//            true,
//            "Henry",
//            12.0,
//            "calico",
//            false,
//            2
//    );
//
//    Dog dog = new Dog(
//            4,
//            "Large",
//            true,
//            "Jasper",
//            65.0,
//            "Golden Retiever",
//            "med",
//            "#13"
//    );

        List<Animal> animals = new ArrayList<>();

        DayCare.addAnimal(
                new Animal(4, "small",false,"Raul",2.0),
                animals
        );

        DayCare.addAnimal(
                new Cat(4, "medium", true, "Henry", 12.0, "calico", false, 2),
                animals

        );

        DayCare.addAnimal(
                new Dog(4,"large", true, "Jasper", 65.0, "Golden Retiever", "med", "#13"),
                animals
        );

        DayCare.displayAnimals(animals);
        DayCare.removeAnimal(animals, "Henry");
        DayCare.displayAnimals(animals);



//    frog.speak();
//    cat.speak();
//    dog.speak();
    }


}
