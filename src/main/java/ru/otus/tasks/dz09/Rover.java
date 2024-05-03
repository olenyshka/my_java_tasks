package ru.otus.tasks.dz09;

public class Rover implements Transport {
    private double petrol;

    public void setPetrol(double petrol) {
        this.petrol = petrol;
    }

    public double getPetrol() {
        return petrol;
    }

    public Rover(double petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean move(PlaceType type, int distance) {
        double ratePetrol = 20;   //расход 8л на 100 км
        if (distance >= (100 / ratePetrol * petrol)) {
            System.out.println("Бензина хватит только на " + (100 / ratePetrol * petrol) + " км. Нужно больше бензина.\n");
            return false;
        }
        petrol -= distance * (ratePetrol / 100);
        System.out.println("Проехали по " + type.getPlace() + " на вездеходе, осталось " + petrol + "л бензина");
        return true;
    }
}
