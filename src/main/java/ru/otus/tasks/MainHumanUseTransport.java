package ru.otus.tasks;

public class MainHumanUseTransport {
    public static void main(String[] args) {

        Human man = new Human("Витёк");
        PlaceType type = PlaceType.field;


        Car car = new Car(20);

//    man.move(PlaceType.field);

        System.out.println(car.toString());

//        man.takeTransport(type.toString());

//        man.getCurrentTransport();

        System.out.println(type.toString());





    }

}
