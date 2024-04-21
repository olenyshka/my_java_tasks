package ru.otus.tasks;

public class Cat extends Animal{
    public Cat(String name,String color, double speed, int stamina){
        super(name, color, speed, stamina);

    }



    @Override
    public void info(){
        System.out.println("Животное: кошка    Имя: " + this.name + "\t цвет: " + this.color + "\t скорость: " + this.speed + "\tвыносливость: " + this.stamina);
    }

    public int swim(int distance) {
        System.out.println("Кошки плавать не умеют");
        return -1;

    }


}
