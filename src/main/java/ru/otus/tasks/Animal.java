package ru.otus.tasks;

public abstract class Animal {
    final String name;
    final String color;
    final double speed;
    int stamina;
    //   final int wasteOfStaminaForRun;


    public Animal(String name, String color, double speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        stamina = 100;
//        wasteOfStaminaForRun = 1;//единиц выносливости на 1 метр бега, по умолчанию 1
    }

    public int run(double distance) {
        int spentTime = 0;
        if (stamina >= distance) {
            spentTime = (int) (distance / speed); //думала double, но надо вернуть -1, если false
            stamina -= (int) distance;
            System.out.println("Бег. Дистанция пройдена, осталось stamina: " + stamina);
        } else {
            System.out.println("Выносливости не хватит на всю дистанцию, надо отдохнуть"); //достаточно ли такого условия
            spentTime = -1;
        }
        return spentTime;
    }

    public abstract void info();

    public abstract void takeARest();


}
