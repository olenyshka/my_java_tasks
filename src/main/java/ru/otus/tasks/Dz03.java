package ru.otus.tasks;

public class Dz03 {
    public static void main(String[] args) {

        greetings();
        System.out.println();

        int a = 35;
        int b = 7;
        int c = -24;
        boolean increment = false;
        checkSign(a, b, c);
        selectColor();
        compareNumbers();
        addOrSubstractAndPrint(a, b, increment);


    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");

    }

    public static void checkSign(int a, int b, int c){
        int sum = 0;
        sum = a + b + c;
        if (sum > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void selectColor() {
        int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 & data <= 20 ) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubstractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
        } else {
            initValue -= delta;
            System.out.println(initValue);
        }
    }




}


