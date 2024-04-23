package ru.otus.tasks;

public class Cat {
    private final String name;

    private boolean fullness;

    int countFoodForFullness;


    public Cat(String name, int countFoodForFullness){
        this.name = name;
        this.fullness = false;
        this.countFoodForFullness = countFoodForFullness;
    }


    public void eat(Plate plate){      //Plate plate
        if (this.countFoodForFullness > plate.currentAmountOfFood){
            System.out.println("Недостаточно еды, для " + this.name + " нужно " + this.countFoodForFullness);
        } else {
            this.fullness = true;
            plate.diffFood(this.countFoodForFullness );
            System.out.println("Кот " + this.name + " наелся.");
        }
    }

    public void getHungry(){
        this.fullness = false;
        System.out.println("Кот " + this.name + " проголодался");
    }


    public void isFullness(){
        if(this.fullness){
            System.out.println("Кот " + this.name + " сыт");
        } else {
            System.out.println("Кот " + this.name + " голодный");
        }
    }






}
