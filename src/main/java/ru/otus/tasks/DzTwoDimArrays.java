package ru.otus.tasks;

public class DzTwoDimArrays {
    public static void main(String[] args){

        int[][] values1 = {{2, 8, 6}, {4, 0, 3}, {7, 5, 5}};
        sumOfPositiveElements(values1);
        System.out.println();


        int n = 4;
        squareOfStars(n);
        System.out.println();

        int[][] values2 = {{2, 8, 6, 5}, {4, 0, 3, 3}, {7, 5, 5, 9}, {8, 3, 7, 9}};
        squareZeroDiagonal(values2);
        System.out.println();

        System.out.println("максимальный элемент массива: " + getMaxNum(values1));



        int[][] values3 = {{2, 8, 6, 5}, {4, 0, 3, 3}, {7, 5, 5, 9}, {8, 3, 7, 9}};

        System.out.println("Сумма элементов второй строки: " + getSecondRow(values3));

        System.out.println("Сумма элементов второго столбца: " + getSecondColumn(values3));

//        ошибка при отсутствии второй строки и столбца

        int[][] values4 = {{2}, {5}};

//        System.out.println("Сумма элементов второй строки: " + getSecondRow(values4));
//
//        System.out.println("Сумма элементов второго столбца: " + getSecondColumn(values4));

        int[][] values5 = {{2, 5}, {}};

//        System.out.println("Сумма элементов второй строки: " + getSecondRow(values5));
//
//        System.out.println("Сумма элементов второго столбца: " + getSecondColumn(values5));
    }

    public static void sumOfPositiveElements(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[i].length; j++){
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
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

    public static void squareZeroDiagonal(int[][] array){
        // одна диагональ
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (j == i) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        // вторая диагональ
        System.out.println();
        int num = array.length;

        for (int i = 0; i < array.length; i++){
            for (int j = array[i].length; j >= 0; j--){
                if (j == num-1) {
                    array[i][j] = 0;
                }
            }
            num -= 1;
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

    public static int getSecondRow(int[][] array){

        int sumSecondRow = 0;

        if (array.length >=2) {

            for (int i = 0; i < array.length; i++) {
                sumSecondRow += array[1][i];
            }
        } else {
            sumSecondRow = -1;
        }
        return sumSecondRow;
    }


    public static int getSecondColumn(int[][] array){

        int sumSecondColumn = 0;

        if (array[0].length >=2) {
            for (int i = 0; i < array[0].length; i++) {
                sumSecondColumn += array[i][1];
            }
        } else {
            sumSecondColumn = -1;
        }
        return sumSecondColumn;
    }

}
