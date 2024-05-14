package ru.otus.tasks.dz12;

public class MainPhoneBook {
    public static void main(String[] args) {


        PhoneBook book = new PhoneBook();

        book.add("Иванов Иван", "89291234567");
        book.add("Иванов Иван", "89811234567");
        book.add("Сергеев Андрей", "89181234577");
        book.add("Андреев Никита", "89181111111");
        book.add("Кузнецов Вячеслав", "89181111111");


        book.find("Иванов Иван");
        book.find("Борисов Николай");

        book.containsPhoneNumber("89291234567");
        book.containsPhoneNumber("89501234567");
        book.containsPhoneNumber("89181111111");

        System.out.println();

        PhoneBookHuman bookHuman = new PhoneBookHuman();


        Human man1 = new Human("Иванов", "Иван", "Иванович");
        Human man2 = new Human("Сергеев", "Андрей", "Сергеевич");
        Human man3 = new Human("Андреев", "Никита", "Андреевич");
        Human man4 = new Human("Андреев", "Вячеслав", "Юрьевич");
        Human man5 = new Human("Михайлов", "Станислав", "Иванович");

        bookHuman.add(man1, "89291234567");
        bookHuman.add(man1, "89293333333");
        bookHuman.add(man2, "89811234567");
        bookHuman.add(man3, "89181234577");
        bookHuman.add(man4, "89181111111");
        bookHuman.add(man5, "89181111111");

        bookHuman.find("Иванов");
        bookHuman.find("Андреев");
        bookHuman.find("Сидоров");

        bookHuman.containsPhoneNumber("89181111111");
        bookHuman.containsPhoneNumber("89811234567");
        bookHuman.containsPhoneNumber("11111111111");


    }
}
