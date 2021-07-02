package com.company;
import java.util.*;

public class DayCare {
//
//    List<Animal> animals = new ArrayList<>();

    public static void addAnimal(Animal animal, List<Animal> animalList) {
        animalList.add(animal);
    }

    public static void displayAnimals(List<Animal> animals) {
        for (Animal animal : animals) {

            System.out.println(animal.name + " has " + animal.legs + " legs, and weighs " + animal.weight);


        }

    }

    public static void removeAnimal(List<Animal> animals, String name) {
        animals.removeIf(animal -> animal.name.equals(name));

    }
}