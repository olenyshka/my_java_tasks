package ru.otus.tasks.dz08;

public class CatsUsePlates {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Томас", 15),
                new Cat("Барсик", 25),
                new Cat("Карлос", 50),
                new Cat("Джим", 20)
        };

        Plate plate = new Plate(40);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].getInfoFullness();
        }

        plate.addFood(150);

        System.out.println();

        cats[0].getHungry();

        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i].getInfoFullness();
        }


        System.out.println();
        cats[3].eat(plate);

        Plate[] platesForEach = {
                new Plate(20),
                new Plate(15),
                new Plate(25),
                new Plate(30),
        };


        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(platesForEach[i]);
            cats[i].getInfoFullness();
            platesForEach[i].info();
            System.out.println();
        }

    }

}
