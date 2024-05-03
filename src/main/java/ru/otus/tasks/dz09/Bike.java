package ru.otus.tasks.dz09;

public class Bike implements Transport {

    private Human driver;

    public void setDriver(Human driver) {
        this.driver = driver;
    }

    public Bike(Human human) {
        this.driver = human;
    }

    @Override
    public boolean move(PlaceType type, int distance) {
        int rateStamina = 2;

        if (type == PlaceType.SWAMP) {
            System.out.println("На велосипеде нельзя проехать по болоту\n");
            return false;
        } else if (driver.getStamina() < (distance * rateStamina)) {
            System.out.println("Сил у " + driver.getName() + " на велике хватит только на " + (distance / rateStamina) + " км.\n");
            return false;
        } else if (driver.getStamina() == 0) {
            System.out.println("Силы у "+ driver.getName() + " на нуле");
            return false;
        } else {
            int staminaVel = driver.getStamina();
            driver.setStamina(staminaVel - (distance * rateStamina));
//        System.out.println(driver.getStamina() - driver.getStamina() * rateStamina);
            System.out.println("Проехали по " + type.getPlace() + " на велосипеде, осталось " + driver.getStamina() + " сил");
            return true;
        }
    }

}
