package ru.otus.tasks;

public class Dog extends Animal {

    final double speedSwim;

    final int wasteOfStaminaForSwim;

    public Dog(String name, String color, double speed) {
        super(name, color, speed);
        wasteOfStaminaForSwim = 2;
        this.speedSwim = 1;
    }

    @Override
    public void info() {
        System.out.println("Животное: собака    Имя: " + name + "\t цвет: " + color + "\t скорость: " + speed + "\tвыносливость: " + getStamina());
    }

    @Override
    public int swim(double distance) {
        int spentTime = 0;
        if (getStamina() >= (distance * wasteOfStaminaForSwim)) {
            spentTime = (int) (distance / speedSwim);
            setStamina(getStamina() - (int) (distance * wasteOfStaminaForSwim));
            System.out.println("Плавание. Дистанция пройдена, осталось stamina: " + getStamina());
        } else {
            System.out.println(name + " устал, надо отдохнуть.");
            spentTime = -1;
        }
        return spentTime;
    }

    @Override
    public void takeARest() {
        setStamina(100);
        System.out.println("Животное: собака    Имя: " + name + " отдохнуло");
    }


}
