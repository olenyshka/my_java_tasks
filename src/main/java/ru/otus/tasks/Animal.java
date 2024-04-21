package ru.otus.tasks;

public class Animal {
    String name;
    String color;

    double speed;

    int stamina;
    int wasteOfStaminaForRun;
    int wasteOfStaminaForSwim;

    public Animal(String name,String color, double speed, int stamina){
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.stamina = stamina;
        this.wasteOfStaminaForRun = 1;//единиц выносливости на 1 метр бега, по умолчанию 1
        this.wasteOfStaminaForSwim = 1;
    }


    // в задаче- реализовать методы, которые должны возвращать время, затраченное на указанное действие, и понижать выносливость животного
    //если выносливости не хватает, то вернем время -1 и указываем, что появилось состояние усталости.

    public int run(int distance) {   //должен возвращать время, затраченное на указанное действие и понижать выносливость.
        int spentTime = 0;
        if (this.stamina >= (distance * this.wasteOfStaminaForRun)) {
            spentTime = (int) (distance / this.speed); //думала double, но надо вернуть -1, если false
            this.stamina -= (distance * this.wasteOfStaminaForRun);
            System.out.println("Бег. Дистанция пройдена, осталось stamina: " + this.stamina);
        } else if (this.stamina > 0){
            System.out.println("Выносливости не хватит на всю дистанцию, надо отдохнуть"); //достаточно ли такого условия
            spentTime = -1;
        }
        return spentTime;
    }

//    public int swim(int distance) {   //В задаче написано методы run и swim, их можно в один метод запихнуть?
//        int spentTime = 0;
//        if (this.stamina >= (distance * this.wasteOfStaminaForRun)) {
//            spentTime = (int) (distance / this.speed);
//            this.stamina -= (distance * this.wasteOfStaminaForSwim);
//            System.out.println("Плавание. Дистанция пройдена, осталось stamina: " + this.stamina);
//        } else if (this.stamina > 0){
//            System.out.println(this.name + " устал, надо отдохнуть.");
//            spentTime = -1;
//        }
//        return spentTime;
//    }

    public void info(){
        System.out.println("Имя: " + this.name + "\t цвет: " + this.color + "\t скорость: " + this.speed + "\tвыносливость: " + this.stamina);
    }



}
