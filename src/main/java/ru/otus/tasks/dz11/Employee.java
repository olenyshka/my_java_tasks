package ru.otus.tasks.dz11;

public class Employee {

    private String name;
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
        if (age > 18 && age < 100) {
            this.name = name;
            this.age = age;
        } else {
            throw new IllegalArgumentException("Возраст должен быть от 18 до 100, а вы ввели: " + age);
        }

    }

}
