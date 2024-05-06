package ru.otus.tasks.dz10;

public class ArrayMain {
    public static void main(String[] args){

        String[][] array1 = {{"2", "8", "6", "5"}, {"4", "0", "3", "3"}, {"7", "5", "5", "9"}, {"8", "3", "7", "9"}};

        System.out.println("Размер массива array1: " + array1.length + "x" + array1[0].length);
       // System.out.println(sumArrayElements(array1));
        System.out.println("Сумма элементов массива array1:");
        sumArrayElements(array1);
        System.out.println();


        String[][] array2 = { {"4", "0", "3", "3"}, {"7", "5", "5", "9"}, {"8", "3", "7", "9"}};
        System.out.println("Размер массива array2: " + array2.length + "x" + array2[0].length);
        //System.out.println(sumArrayElements(array2));
        System.out.println("Сумма элементов массива array2:");
        sumArrayElements(array2);
        System.out.println();

        String[][] array3 = { {"2", "8", "6", "5"}, {"4", "hello", "3", "3"}, {"7", "5", "5", "9"}, {"8", "3", "7", "9"}};
        System.out.println("Размер массива array3: " + array3.length + "x" + array3[0].length);

        //System.out.println(sumArrayElements(array3));
        System.out.println("Сумма элементов массива array3:");
        sumArrayElements(array3);

    }

    public static void getArrayLength(String[][] arr) throws AppArraySizeException {
        if (arr.length < 4 || arr[0].length < 4) {
            throw new AppArraySizeException("Некорректный размер массива");
        }
    }


    public static void sumArrayElements(String[][] arr) {

        try {
            getArrayLength(arr);
        } catch (AppArraySizeException e) {
            e.printStackTrace();
            System.out.println("Некорректный размер массива. Должен быть 4x4, а у вас: " + arr.length + "x" + arr[0].length);
            return;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println(arr[i][j]);
                try {
                    int element = Integer.parseInt(arr[i][j]);
                    sum += element;
                } catch (NumberFormatException e) {
                System.out.println("Неверные данные в ячейке: " + (i+1) + " строка, " + (j+1) + " столбец");
                return;

                }
            }
        }
        System.out.println(sum);



    }




}
