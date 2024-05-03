package ru.otus.tasks.dz06;

import java.util.Scanner;

public class UseBox {
    public static void main(String[] args) {
        Box box = new Box(15, "зеленая");


        box.printInfo();

//        box.setIsOpened(true);

        box.open();

        box.printInfo();

        box.getThing();


        System.out.println("Какой предмет положим ");

        Scanner scanner = new Scanner(System.in);

        String thing = scanner.nextLine();

        box.putThing(thing);

        box.getThing();

        box.close();





    }
}
