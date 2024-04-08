package ru.otus.tasks;

public class Box {
    private String size;

    private String color;

    private boolean isBoxOpened;

    private String thing;

//    public void setSize(String size){
//        this.size = size;
//    }

    public String getSize(){
        return size;
    }

    public void setIsBoxOpened(boolean isBoxOpened){
        this.isBoxOpened = isBoxOpened;
    }

    public boolean getIsBoxOpened(){
        return isBoxOpened;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

//    private void setThingInBox(String thingInBox){
//        this.thingInBox = thingInBox;
//    }

    private String getThingInBox(){
        return thing;
    }

    public Box(String size, String color){
        this.size = size;
        this.color = color;
        this.isBoxOpened = false;
        this.thing = "";

    }


    public void printInfo(){
        System.out.println(size + " " + color);
        System.out.println("Коробка " + ((thing.isEmpty()) ? ("пустая") : "не пустая"));
        System.out.println(isBoxOpened ? "открыта" : "закрыта");
        System.out.println();
    }


    public void putThingInBox(String thing){
        if(getIsBoxOpened()) {
            if (this.thing.isEmpty()) {
                this.thing = thing;
                System.out.println(this.thing + " положили в коробку");
            } else {
                System.out.println("В коробке уже есть предмет " + this.thing);
            }
        } else {
            System.out.println("Коробка закрыта, сначала надо ее открыть.");
        }
    }

    public void takeOutOfBox(){
        if(getIsBoxOpened()) {
            if (!thing.isEmpty()) {
                System.out.println(thing + " достали из коробки. Коробка теперь пустая.");
                this.thing = "";
            } else {
                System.out.println("Коробка пуста, доставать нечего");
            }
        } else {
            System.out.println("Коробка закрыта, сначала надо ее открыть.");
        }
    }



}
