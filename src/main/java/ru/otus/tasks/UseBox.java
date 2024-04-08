package ru.otus.tasks;

import java.util.Scanner;

public class UseBox {
    public static void main(String[] args) {
        Box box = new Box("большая", "зеленая");


        box.printInfo();

        box.setIsBoxOpened(true);

        box.printInfo();

        box.takeOutOfBox();




        System.out.println("Какой предмет положим ");

        Scanner scanner = new Scanner(System.in);

        String thing = scanner.nextLine();

        box.putThingInBox(thing);

        box.takeOutOfBox();





    }
}
