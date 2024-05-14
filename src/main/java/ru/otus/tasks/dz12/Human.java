package ru.otus.tasks.dz12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Human {
    private final String lastname;    //фамилия
    private final String name;
    private final String surname;     //отчество

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

//    Set<String> phoneNumbers = new HashSet<>();

    public Human(String lastname, String name, String surname) {
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return lastname + " " + name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(lastname, human.lastname) && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, name, surname);
    }
}
