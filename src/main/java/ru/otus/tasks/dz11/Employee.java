package ru.otus.tasks.dz11;

public class Employee {

    private final String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }




}
