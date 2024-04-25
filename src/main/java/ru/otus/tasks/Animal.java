package ru.otus.tasks;

public abstract class Animal {
    protected final String name;
    protected final String color;
    protected final double speed;
    private int stamina;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Animal(String name, String color, double speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        stamina = 100;
    }

    public int run(double distance) {
        int spentTime = 0;
        if (getStamina() >= distance) {
            spentTime = (int) (distance / speed); //думала double, но надо вернуть -1, если false
            setStamina(getStamina() - (int) distance);
            System.out.println("Бег. Дистанция пройдена, осталось stamina: " + getStamina());
        } else {
            System.out.println("Выносливости не хватит на всю дистанцию, надо отдохнуть");
            spentTime = -1;
        }
        return spentTime;
    }

    public abstract int swim(double distance);

    public abstract void info();

    public abstract void takeARest();


}
