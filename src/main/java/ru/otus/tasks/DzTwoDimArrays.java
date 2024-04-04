package ru.otus.tasks;

import java.util.Arrays;

public class DzTwoDimArrays {
    public static void main(String[] args){

        int[][] values1 = {{2, 8, 6}, {4, 0, 3}, {7, 5, 5}};
        int res = getSumOfPositiveElements(values1);
        System.out.println("1.sumOfPositiveElements: " + res);      //+В задаче указано, что метод должен вернуть сумму...
        System.out.println();

        System.out.println("2.squareOfStars:");
        int n = 4;
        squareOfStars(n);
        System.out.println();


        System.out.println("3.squareZeroDiagonalOpt:");

        int[][] values22 = {{2, 8, 6, 5}, {4, 0, 3, 3}, {7, 5, 5, 9}, {8, 3, 7, 9}};
        squareZeroDiagonalOpt(values22);
        System.out.println();


        System.out.println("3.squareZeroDiagonalOld:");

        int[][] values2 = {{2, 8, 6, 5}, {4, 0, 3, 3}, {7, 5, 5, 9}, {8, 3, 7, 9}};
        squareZeroDiagonalOld(values2);
        System.out.println();


        System.out.println("4.getMaxNum Максимальный элемент массива: " + getMaxNum(values1));
        System.out.println();


        System.out.println("5.getSecondRowSum : ");

        int[][] values3 = {{2, 8, 6, 5}, {4, 0, 3, 3}, {7, 5, 5, 9}, {8, 3, 7, 9}};

        System.out.println(Arrays.deepToString(values3));

        System.out.println("Сумма элементов второй строки: " + getSecondRowSum(values3));

        System.out.println("Сумма элементов второго столбца: " + getSecondColumnSum(values3));
        System.out.println();



        int[][] values4 = {{2}, {5}};

        System.out.println("Сумма элементов второй строки {{2}, {5}}: " + getSecondRowSum(values4));

        System.out.println("Сумма элементов второго столбца {{2}, {5}}: " + getSecondColumnSum(values4));
        System.out.println();

        int[][] values5 = {{2, 5}};

        System.out.println("Сумма элементов второй строки {{2, 5}}: " + getSecondRowSum(values5));

        System.out.println("Сумма элементов второго столбца {{2, 5}}: " + getSecondColumnSum(values5));
        System.out.println();


        int[][] values6 = {{2}, {2}, {2}};
        System.out.println("Сумма элементов второй строки {{2}, {2}, {2}}: " + getSecondRowSum(values6));

        System.out.println("Сумма элементов второго столбца {{2}, {2}, {2}}: " + getSecondColumnSum(values6));
        System.out.println();

    }

    public static int getSumOfPositiveElements(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[i].length; j++){
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void squareOfStars(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.println("*");
                } else {
                    System.out.print("*" + " ");
                }
            }
        }
    }

    public static void squareZeroDiagonalOpt(int[][] array){

        int arraySize = array.length;
        System.out.println(arraySize);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(j == i || j == arraySize-1) {      //j == i |
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }
            arraySize--;
            System.out.println();
        }
    }

    public static void squareZeroDiagonalOld(int[][] array){       //но если есть время поковыряться, то оптимизируй метод, чтобы выполнять эти три действия (три цикла) в одном цикле.
        // одна диагональ
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (j == i) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        // вторая диагональ
        System.out.println();
        int arraySize = array.length;       //называй по смыслу, если это размер массива то arraySize, и пробегись по названиям переменных

        for (int i = 0; i < array.length; i++){
            for (int j = array[i].length; j >= 0; j--){
                if (j == arraySize-1) {
                    array[i][j] = 0;
                }
            }
            arraySize -= 1;
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }

    public static int getMaxNum(int[][] array){
        int maxNum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                if (array[i][j] > maxNum){
                    maxNum = array[i][j];
                }
            }
        }
        return maxNum;
    }

    public static int getSecondRowSum(int[][] array){      //+getSecondRow  возвращает сумму? тогда переназови как getSecondRowSum  {{2}, {5}};

        int secondRowSum = 0;

        if (array.length >=2) {         //А такой массив посчитает? int[][] values2 = {{2},{2},{2}};    //если больше 2 строк
                for (int i = 0; i < array[1].length; i++) {
                    secondRowSum += array[1][i];        //+secondRowSum
            }
        } else {
            secondRowSum = -1;
        }
        return secondRowSum;
    }


    public static int getSecondColumnSum(int[][] array){        //а если  {{2, 5}};

        int secondColumnSum = 0;

        if (array.length >=1) {
            for (int i =0; i < array.length; i++){
                if(array[i].length >= 2) {              //если длина строка >=2
                    secondColumnSum += array[i][1];
                }
            }
        } else {
            secondColumnSum = -1;
        }
        return secondColumnSum;
    }

}
