package ru.otus.tasks.dz10;

public class AppArraySizeException extends IndexOutOfBoundsException{       //наследоваться от класса поконкретнее

    public AppArraySizeException(String message) {
        super(message);
    }
}
