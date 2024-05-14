package ru.otus.tasks.dz12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBookHuman {
    private Map<Human, HashSet<String>> phoneBook;

    public PhoneBookHuman() {
        phoneBook = new HashMap<>();
    }

    public void add(Human human, String phone) {
        if (phoneBook.containsKey(human)) {
            HashSet<String> checkPhones = phoneBook.get(human);

            if (checkPhones.contains(phone)) {
                System.out.println("У " + human.toString() + " уже есть номер " + phone + " в телефонной книге");

            } else {
                checkPhones.add(phone);
                System.out.println("Для " + human.toString() + " добавили номер " + phone);
            }
        } else {
            HashSet<String> newPhones = new HashSet<>();
            newPhones.add(phone);
            phoneBook.put(human, newPhones);
            System.out.println("Для " + human.toString() + " добавили номер " + phone);
        }
    }

    public void find(String lastname) {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пока пуста");
            return;
        }
        Set<Human> humans = phoneBook.keySet();
        for (Human man : humans) {
            if (man.getLastname().equals(lastname)) {       // || man.getName().equals(lastname)

                HashSet<String> findPhones = phoneBook.get(man);

                System.out.println("Для " + man.toString() + ":");

                for (String phone : findPhones) {
                    System.out.println(phone);
                }
            }
        }
    }

    public void containsPhoneNumber(String phone) {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пока пуста");
            return;
        }
        String findPhone = "";
        for (Human person : phoneBook.keySet()) {
            HashSet<String> personPhones = phoneBook.get(person);
            if (personPhones.contains(phone)) {
                System.out.println("Найден номер " + phone + " у " + person.toString());
                findPhone = phone;
            }
        }
        if (findPhone.isEmpty()) {
            System.out.println(phone + " в телефонной книге нет");
        }
    }

}
