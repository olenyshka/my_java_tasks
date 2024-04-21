package ru.otus.tasks;

public class Horse extends Animal{

    final double speedSwim;
    public Horse(String name,String color, double speed, int stamina){
        super(name, color, speed, stamina);
        this.wasteOfStaminaForSwim = 4;
        this.speedSwim = 1;
    }

    @Override
    public void info(){
        System.out.println("Животное: лошадь    Имя: " + this.name + "\t цвет: " + this.color + "\t скорость: " + this.speed + "\tвыносливость: " + this.stamina);
    }

    public int swim(int distance){
        int spentTime = 0;
        if (this.stamina >= (distance * this.wasteOfStaminaForSwim)) {
            spentTime = (int) (distance / this.speedSwim);
            this.stamina -= (distance * this.wasteOfStaminaForSwim);
            System.out.println("Плавание. Дистанция пройдена, осталось stamina: " + this.stamina);
        } else if (this.stamina > 0){
            System.out.println(this.name + " устал, надо отдохнуть.");
            spentTime = -1;
        }
        return spentTime;
    }


}
