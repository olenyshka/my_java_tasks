package ru.otus.tasks.dz08;

public class Plate {
    private final int maxAmountOfFood;        //количество еды в условных единицах
    private int currentAmountOfFood;

    public int getCurrentAmountOfFood() {
        return currentAmountOfFood;
    }

    public Plate(int maxAmountOfFood) {
        this.maxAmountOfFood = maxAmountOfFood;
        currentAmountOfFood = maxAmountOfFood;     //при создании полностью заполнить едой
    }

    public void addFood(int food) {
        if (currentAmountOfFood + food <= maxAmountOfFood) {
            currentAmountOfFood += food;
            System.out.println("В тарелке появился корм");
        } else {
            currentAmountOfFood = maxAmountOfFood;
            System.out.println("Тарелка полная");
        }
    }

    public boolean diffFood(int food) {
        if (currentAmountOfFood - food >= 0) {
            currentAmountOfFood -= food;
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("Максимальная вместимость тарелки " + maxAmountOfFood
                + ". Текущее количество еды в тарелке " + currentAmountOfFood);
    }


}
