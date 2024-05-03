package ru.otus.tasks.dz06;

public class Box {
    private final int size;

    private String color;

    private boolean isOpened;

    private String thing;


    public int getSize() {
        return size;
    }

    public void open() {
        if (isOpened) {
            System.out.println("Коробка уже была открыта");
        } else {
            System.out.println("Коробка теперь открыта");
            isOpened = true;
        }
    }

    public void close() {
        if (!isOpened) {
            System.out.println("Коробка теперь закрыта");
            isOpened = false;
        } else {
            System.out.println("Коробка уже была закрыта");
        }
    }

    public boolean getIsOpened() {
        return isOpened;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        isOpened = false; //Не обязательно править, но по умолчанию, если не инициализировать String будет null, а boolean - false, поэтому эти пара строк тут по сути лишние.
//        this.thing = "";

    }


    public void printInfo() {
        System.out.println(size + " " + color);
        System.out.println("Коробка " + ((thing == null || thing.isEmpty()) ? ("пустая") : "не пустая"));
        System.out.println(isOpened ? "открыта" : "закрыта");
        System.out.println();
    }


    public void putThing(String thing) {
        if (isOpened) {
            if (this.thing == null || this.thing.isEmpty()) {
                this.thing = thing;
                System.out.println(this.thing + " положили в коробку");
            } else {
                System.out.println("В коробке уже есть предмет " + this.thing);
            }
        } else {
            System.out.println("Коробка закрыта, сначала надо ее открыть.");
        }
    }

    public void getThing() {
        if (isOpened) {
            if (!(thing == null || thing.isEmpty())) {          //а если thing подать null?
                System.out.println(thing + " достали из коробки. Коробка теперь пустая.");
                thing = "";
            } else {
                System.out.println("Коробка пуста, доставать нечего");
            }
        } else {
            System.out.println("Коробка закрыта, сначала надо ее открыть.");
        }
    }


}
