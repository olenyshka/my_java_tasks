package ru.otus.tasks;

public class Cat extends Animal {
    public Cat(String name, String color, double speed) {
        super(name, color, speed);

    }

    @Override
    public void info() {
        System.out.println("Животное: кошка    Имя: " + name + "\t цвет: " + color + "\t скорость: " + speed + "\tвыносливость: " + stamina);
    }

    @Override
    public void takeARest() {
        stamina = 100;
        System.out.println("Животное: кошка    Имя: " + name + " отдохнуло");
    }


}
