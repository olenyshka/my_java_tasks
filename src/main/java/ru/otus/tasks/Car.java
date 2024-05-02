package ru.otus.tasks;

public class Car implements Move{

    private int petrol;

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public int getPetrol() {
        return petrol;
    }

    public Car(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public void move(PlaceType type, int distance) {
        int rate = 8;   //расход 8л на 100 км
        if (type == PlaceType.denseForest) {
            System.out.println("Машина не может проехать по густому лесу");
            return;
        } else if (type == PlaceType.swamp) {
            System.out.println("Машина не может проехать по болоту");
            return;
        } else if (distance >= (100 / rate * petrol)) {
            System.out.println("Бензина хватит только на " + (100 / rate * petrol) + " км");
            return;
        }
        petrol -= distance * (rate / 100);
        System.out.println("Проехали по " + type + " на машине, осталось " + petrol + "л бензина");

    }
}
