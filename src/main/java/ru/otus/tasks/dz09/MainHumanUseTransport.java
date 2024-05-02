package ru.otus.tasks.dz09;

public class MainHumanUseTransport {
    public static void main(String[] args) {

        Human man = new Human("Витёк");
//        PlaceType type = PlaceType.FIELD;

        System.out.println(man.getCurrentTransport());


        Car car = new Car(20);
        man.getOffTheTransport();
        man.takeTransport(car);

        System.out.println(man.getCurrentTransport());

        man.move(PlaceType.DENSE_FOREST, 100);
        man.move(PlaceType.FIELD, 100);
        man.move(PlaceType.FIELD, 100);
        man.getOffTheTransport();

        man.move(PlaceType.DENSE_FOREST, 20);


        man.setStamina(200);

        man.takeTransport(car);
        man.move(PlaceType.SWAMP, 10);

        Horse horse = new Horse();
        man.takeTransport(horse);
        man.getOffTheTransport();
        man.takeTransport(horse);

        man.move(PlaceType.SWAMP, 10);
        man.move(PlaceType.DENSE_FOREST, 20);
        man.getOffTheTransport();

        Rover rover = new Rover(40);
        man.takeTransport(rover);
        man.move(PlaceType.SWAMP, 50);
        man.move(PlaceType.DENSE_FOREST, 20);
        man.move(PlaceType.FIELD, 100);

        man.getOffTheTransport();

        man.setStamina(100);

        Bike bike = new Bike(man);
        man.takeTransport(bike);
        System.out.println(man.getStamina());
        man.move(PlaceType.SWAMP, 50);
        System.out.println(man.getStamina());
        man.move(PlaceType.DENSE_FOREST, 20);
        System.out.println(man.getStamina());
        man.move(PlaceType.FIELD, 100);

        System.out.println(man.getStamina());

        System.out.println(man.getClass());

    }

}
