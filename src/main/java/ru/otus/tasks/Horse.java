package ru.otus.tasks;

public class Horse extends Animal {

    private final double speedSwim;

    private final int wasteOfStaminaForSwim;

    public double getSpeedSwim() {
        return speedSwim;
    }

    public int getWasteOfStaminaForSwim() {
        return wasteOfStaminaForSwim;
    }

    public Horse(String name, String color, double speed) {
        super(name, color, speed);
        wasteOfStaminaForSwim = 4;
        speedSwim = 1;
    }

    @Override
    public void info() {
        System.out.println("Животное: лошадь    Имя: " + name + "\t цвет: " + color + "\t скорость: " + speed + "\tвыносливость: " + getStamina());
    }

    @Override
    public int swim(double distance) {
        int spentTime = 0;
        if (getStamina() >= (distance * wasteOfStaminaForSwim)) {
            spentTime = (int) (distance / speedSwim);
            setStamina(getStamina() - (int) (distance * wasteOfStaminaForSwim));
            System.out.println("Плавание. Дистанция пройдена, осталось stamina: " + getStamina());
        } else {
            System.out.println(name + " устал, надо отдохнуть.");
            spentTime = -1;
        }
        return spentTime;
    }

    @Override
    public void takeARest() {
        setStamina(100);
        System.out.println("Животное: лошадь    Имя: " + name + " отдохнуло");
    }

}
