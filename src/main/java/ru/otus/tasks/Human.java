package ru.otus.tasks;

public class Human {
    private final String name;
    private String currentTransport;

    private int stamina;

    public String setName() {
        return name;
    }

    public String getCurrentTransport() {
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
        currentTransport = "Walk";
    }

    public void takeTransport(TransportType transportType) {       //Object object?  //Как сюда передать вид транспорта
        if (!currentTransport.equals("Walk")) {
            System.out.println(name + " итак уже на " + currentTransport + ". Надо сначала слезть/вылезти с " + currentTransport);
            return;
        }
//        else if (currentTransport != ) {
//            System.out.println("Нет такого транспорта. Выберите из существующих");
//            return;
//        }
        currentTransport = String.valueOf(transportType);
    }

    public void getOffTheTransport() {
        currentTransport = "Walk";
        System.out.println("Теперь идем пешком");
    }

    public void move() {

    }


}
