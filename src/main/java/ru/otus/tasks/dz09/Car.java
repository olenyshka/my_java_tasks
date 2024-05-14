package ru.otus.tasks.dz09;

public class Car implements Transport {

    private double petrol;
//    private Human driver;

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public double getPetrol() {
        return petrol;
    }

    public Car(double petrol) {
        this.petrol = petrol;
    }

//    @Override
//    public void setDriver(Human driver) {
//        this.driver = driver;
//    }

    @Override
    public boolean move(PlaceType type, int distance) {
        double ratePetrol = 15;   //расход 8л на 100 км
        if (type == PlaceType.DENSE_FOREST) {
            System.out.println("Машина не может проехать по густому лесу\n");
            return false;
        } else if (type == PlaceType.SWAMP) {
            System.out.println("Машина не может проехать по болоту\n");
            return false;
        } else if (distance >= (100.0 / ratePetrol * petrol)) {
            System.out.println("Бензина хватит только на " + (100.0 / ratePetrol * petrol) + " км. Нужно больше бензина.\n");
            return false;
        } else {
            petrol -= distance * (ratePetrol / 100.0);
            System.out.println("Проехали по " + type.getPlace() + " на машине, осталось " + petrol + "л бензина");
            return true;
        }

    }
}
