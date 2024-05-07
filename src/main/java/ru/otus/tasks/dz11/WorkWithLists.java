package ru.otus.tasks.dz11;

import java.util.ArrayList;
import java.util.List;

public class WorkWithLists {
    public static void main(String[] args) {

        getSeqValues(5, 9);
//        System.out.println(getSeqValues(5, 9));


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);

        System.out.println(sumElementsMoreThanFive(arrayList));

        replaceAllValuesOfArray(3, arrayList);

        increaseAllValuesOfList(2, arrayList);


    }


    public static ArrayList getSeqValues(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = max; i >= min; i--) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        return arrayList;
    }


    public static int sumElementsMoreThanFive(List<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    public static void replaceAllValuesOfArray(int num, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, num);
        }
        System.out.println(list);
    }

    public static void increaseAllValuesOfList(int num, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
        System.out.println(list);
    }


}
