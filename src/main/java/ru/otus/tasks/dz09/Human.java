package ru.otus.tasks.dz09;

public class Human {
    private final String name;
    private Transport currentTransport;

    private int stamina;

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public Human(String name) {
        this.name = name;
        stamina = 100;
    }

    public void takeTransport(Transport transport) {       //Как сюда передать вид транспорта

        if (currentTransport == null) {
            currentTransport = transport;
            System.out.println("Сели на " + transport + "\n");
        } else {
            System.out.println(name + " уже на " + currentTransport + ". Надо сначала слезть с текущего транспорта.");
        }
    }

    public void getOffTheTransport() {
        if (currentTransport == null) {
            System.out.println(name + " уже был пеший.");
            return;
        }
        currentTransport = null;
        System.out.println("Слезли с транспорта\n");
    }

    public boolean move(PlaceType type, int distance) {
        int rateForWalk = 4;
        if (currentTransport != null) {
            return currentTransport.move(type, distance);
        }

        System.out.println("Идем пешком по " + type.getPlace() + " " + distance + " км");
        if (stamina <= distance * rateForWalk) {
            System.out.println("Но сил не хватит на всю дистанцию.\n");
            return false;
        }
        stamina -= distance * rateForWalk;
        System.out.println("Прошли по " + type.getPlace() + ", осталось сил " + stamina + "\n");
        return true;

    }


}
