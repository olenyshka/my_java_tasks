package ru.otus.tasks.dz10;

public class AppArrayDataException extends NumberFormatException{

    public AppArrayDataException(int i, int j) {
        super("Неверные данные в ячейке: " + i + " строка, " + j + " столбец");

    }
}
