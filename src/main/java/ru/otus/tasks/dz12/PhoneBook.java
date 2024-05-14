package ru.otus.tasks.dz12;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phone) {
        // Если все телефоны и ФИО в одном виде и если не нужна проверка конкретно по фамилии
        if (phoneBook.containsKey(name)) {
            HashSet<String> checkPhones = phoneBook.get(name);

            if (checkPhones.contains(phone)) {
                System.out.println("У " + name + " уже есть номер " + phone + " в телефонной книге");

            } else {
                checkPhones.add(phone);
                System.out.println("Для " + name + " добавили номер " + phone);
            }
        } else {
            HashSet<String> newPhones = new HashSet<>();
            newPhones.add(phone);
            phoneBook.put(name, newPhones);
            System.out.println("Для " + name + " добавили номер " + phone);
        }
    }

    public void find(String name) {         //найти номер по имени
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пока пуста");
            return;
        }
        if (phoneBook.containsKey(name)) {
            HashSet<String> findPhones = phoneBook.get(name);

            System.out.println("Для " + name + ":");

            for (String phone : findPhones) {
                System.out.println(phone);
            }
        } else {
            System.out.println("Для " + name + " найти телефон не удалось");
        }
    }

    public void containsPhoneNumber(String phone) {  //наличие телефона в справочнике
        // если справочник не пустой
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пока пуста");
            return;
        }
        String findPhone = "";
        for (String person : phoneBook.keySet()) {
            HashSet<String> personPhones = phoneBook.get(person);
            if (personPhones.contains(phone)) {
                System.out.println("Найден номер " + phone + " у " + person);
                findPhone = phone;
            }
        }
        if (findPhone.isEmpty()) {
            System.out.println(phone + " в телефонной книге нет");
        }
    }

}
