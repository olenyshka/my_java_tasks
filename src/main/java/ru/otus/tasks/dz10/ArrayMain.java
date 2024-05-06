package ru.otus.tasks.dz10;

public class ArrayMain {
    public static void main(String[] args) {

        String[][] array3 = {
                {"2", "8", "6", "5" },
                {"4", "hello", "3", "3" },
                {"7", "5", "5", "9" },
                {"8", "3", "7", "9" }};

        String[][] array2 = {
                {"4", "0", "3", "3" },
                {"7", "5", "5", "9" },
                {"8", "3", "7", "9" }};

        String[][] array1 = {
                {"2", "8", "6", "5" },
                {"4", "0", "3", "3" },
                {"7", "5", "5", "9" },
                {"8", "3", "7", "9" }};


        try {
            System.out.println("Сумма элементов массива array3:");
            sumArrayElements(array3);
            System.out.println();
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage() + " array3");
            System.out.println();
        } finally {
            try {
                System.out.println("Сумма элементов массива array2:");
                sumArrayElements(array2);
                System.out.println();
            } catch (AppArraySizeException | AppArrayDataException e) {
                System.out.println(e.getMessage() + " array2");
                System.out.println();
            } finally {
//                System.out.println("Сумма элементов массива array2:");
//                sumArrayElements(array2);
//                System.out.println();
                try {
                    System.out.println("Сумма элементов массива array1:");
                    sumArrayElements(array1);
                    System.out.println();
                } catch (AppArraySizeException | AppArrayDataException e) {
                    System.out.println(e.getMessage() + " array1");
                    System.out.println();
                }
            }
        }

    }

    public static boolean checkArraySize(String[][] arr) {
        if (arr.length < 4 || arr[0].length < 4 || arr[1].length < 4 || arr[2].length < 4 || arr[3].length < 4) {
            return false;
        } else {
            return true;
        }
    }

    public static void sumArrayElements(String[][] arr) {

        if (!checkArraySize(arr)) {
            throw new AppArraySizeException("Некорректный размер массива. Должен быть 4x4");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        System.out.println(sum);

    }
}
