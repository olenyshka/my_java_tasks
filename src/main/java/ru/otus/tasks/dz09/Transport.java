package ru.otus.tasks.dz09;

public interface Transport {

//    void setDriver(Human driver);

    boolean move(PlaceType type, int distance);        //в интерфейсе модификаторами доступа не помечаются, должен быть default

}
