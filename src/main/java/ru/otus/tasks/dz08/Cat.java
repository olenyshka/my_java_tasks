package ru.otus.tasks.dz08;

public class Cat {
    private final String name;
    private boolean fullness;
    private final int countFoodForFullness;


    public String getName(){
        return name;
    }

    public int getCountFoodForFullness(){
        return countFoodForFullness;
    }

    public Cat(String name, int countFoodForFullness) {
        this.name = name;
        fullness = false;
        this.countFoodForFullness = countFoodForFullness;
    }

    public void eat(Plate plate) {
        if (countFoodForFullness > plate.getCurrentAmountOfFood()) {
            System.out.println("Недостаточно еды, для " + name + " нужно " + countFoodForFullness);
        } else {
            fullness = true;
            plate.diffFood(countFoodForFullness);
            System.out.println("Кот " + name + " наелся.");
        }
    }

    public void getHungry() {
        fullness = false;
        System.out.println("Кот " + name + " проголодался");
    }

    public void getInfoFullness() {
        if (fullness) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голодный");
        }
    }


}
