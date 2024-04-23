package ru.otus.tasks;

public class MainAnimal {
    public static void main(String[] args) {
        int swimHourse;


        Dog haski = new Dog("Лекса", "серая", 15.0);

//        haski.info();
//        System.out.println("Затрачено на дистанцию 50м " + haski.run(50) + " секунд\n");
        haski.info();
        System.out.println("Затрачено на дистанцию 100м " + haski.swim(50) + " секунд\n");
        haski.info();


        System.out.println();

        Horse mustang = new Horse("Спирит", "коричневый", 30);

        mustang.info();
        System.out.println("Затрачено на дистанцию 50м " + mustang.run(50) + " секунд\n");
        mustang.info();
        System.out.println("Затрачено на дистанцию 100м " + mustang.swim(100) + " секунд\n");
        mustang.info();

        System.out.println();

        Cat houseCat = new Cat("Томас", "серый с белыми лапами", 10);

        houseCat.info();
        System.out.println("Затрачено на дистанцию 50м " + houseCat.run(50) + " секунд\n");
        houseCat.info();


    }
}
