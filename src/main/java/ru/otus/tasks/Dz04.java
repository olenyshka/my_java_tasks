package ru.otus.tasks;

public class Dz04 {
    public static void main(String[] args) {
        System.out.println();
        String str = "Dz";
        int n = 3;

        printFewString(n, str);
        System.out.println();

        int[] values1 = {1, 3, 7, 4, 9, 7, 6, 9};
        printArray(values1);
        System.out.println();

        fillCell(n, values1);
        System.out.println();

        int[] values2 = {1, 3, 7, 4, 9, 7, 6, 9};
        addArrayValue(n, values2);
        System.out.println();

        compareHalfArray(values2);


    }

    public static void printFewString(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void printArray(int[] array) {
        int sum = 0;
        for (int i= 0; i < array.length - 1; i++) {
            if (array[i]>5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillCell(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            System.out.print(" " + array[i]);
        }
    }

    public static void addArrayValue(int n, int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] += n;
            System.out.print(" " + array[i]);
        }
    }

    public static void compareHalfArray(int[] array){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length/2; i++){
            sum1 += array[i];
        }
        for (int i = array.length/2; i < array.length; i++) {
            sum2 += array[i];
        }
        if (sum1 > sum2) {
            System.out.println("Левая половина больше, чем правая: " + sum1 + " > " + sum2);
        } else {
            System.out.println("Правая половина больше, чем левая: " + sum2 + " < " + sum1);
        }

    }

}
