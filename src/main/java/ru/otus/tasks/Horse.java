package ru.otus.tasks;

public class Horse extends Animal {

    final double speedSwim;

    final int wasteOfStaminaForSwim;

    public Horse(String name, String color, double speed) {
        super(name, color, speed);
        wasteOfStaminaForSwim = 4;
        speedSwim = 1;
    }

    @Override
    public void info() {
        System.out.println("Животное: лошадь    Имя: " + name + "\t цвет: " + color + "\t скорость: " + speed + "\tвыносливость: " + stamina);
    }

    public int swim(int distance) {
        int spentTime = 0;
        if (stamina >= (distance * wasteOfStaminaForSwim)) {
            spentTime = (int) (distance / speedSwim);
            stamina -= (distance * wasteOfStaminaForSwim);
            System.out.println("Плавание. Дистанция пройдена, осталось stamina: " + stamina);
        } else {
            System.out.println(name + " устал, надо отдохнуть.");
            spentTime = -1;
        }
        return spentTime;
    }


    @Override
    public void takeARest() {

    }


}
