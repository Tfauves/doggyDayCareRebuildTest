package com.company;

public class Main {

    public static void main(String[] args) {

    Animal frog = new Animal(
            4,
            "small",
            false,
            "Raul",
            2.0
    );

    Cat cat = new Cat(
            4,
            "medium",
            true,
            "Henry",
            12.0,
            "calico",
            false,
            2
    );

    Dog dog = new Dog(
            4,
            "Large",
            true,
            "Jasper",
            65.0,
            "Golden Retiever",
            "med",
            "#13"
    );

    frog.speak();
    cat.speak();
    dog.speak();
    }


}
