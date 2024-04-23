package ru.otus.tasks;

public class Plate {
    final int maxAmountOfFood;        //количество еды в условных единицах
    int currentAmountOfFood;

    public Plate(int maxAmountOfFood){
        this.maxAmountOfFood = maxAmountOfFood;
        this.currentAmountOfFood = maxAmountOfFood;     //при создании полностью заполнить едой

    }

    public void addFood(int food){
        if(this.currentAmountOfFood + food <= this.maxAmountOfFood){
            this.currentAmountOfFood += food;
            System.out.println("В тарелке появился корм");
        } else {
            this.currentAmountOfFood = this.maxAmountOfFood;
            System.out.println("Тарелка полная");
        }
    }

    public boolean diffFood(int food){      //должен быть boolean метод, но как его тут можно использовать по назначению. Или разделить на два метода?
        if(this.currentAmountOfFood - food >= 0){
            this.currentAmountOfFood -= food;
            return true;
        } else {
            return false;
        }

    }

    public void info(){
        System.out.println("Максимальная вместимость тарелки " + this.maxAmountOfFood
                + ". Текущее количество еды в тарелке " + this.currentAmountOfFood);
    }




}
