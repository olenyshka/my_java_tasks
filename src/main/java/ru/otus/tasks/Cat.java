package ru.otus.tasks;

public class Cat extends Animal {
    public Cat(String name, String color, double speed) {
        super(name, color, speed);

    }

    @Override
    public int swim(double distance) {
        System.out.println("Кошки плавать не умеют");
        return -1;
    }

    @Override
    public void info() {
        System.out.println("Животное: кошка    Имя: " + name + "\t цвет: " + color + "\t скорость: " + speed + "\tвыносливость: " + getStamina());
    }

    @Override
    public void takeARest() {
        setStamina(100);
        System.out.println("Животное: кошка    Имя: " + name + " отдохнуло");
    }


}
