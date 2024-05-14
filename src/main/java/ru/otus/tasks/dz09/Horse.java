package ru.otus.tasks.dz09;

public class Horse implements Transport {

    private int stamina;

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public Horse() {
        this.stamina = 200;
    }

    @Override
    public boolean move(PlaceType type, int distance) {
        int rateStamina = 2;
        if (type == PlaceType.SWAMP) {
            System.out.println("Лошадь не может пройти по болоту\n");
            return false;
        } else if (stamina <= (distance * rateStamina)) {
            System.out.println("Сил у лошади хватит только на " + (distance / rateStamina) + " км.\n");
            return false;
        } else {
            stamina -= distance * rateStamina;
            System.out.println("Проехали на лошади " + type.getPlace() + ", осталось " + stamina + " сил");
            return true;
        }


    }


}
