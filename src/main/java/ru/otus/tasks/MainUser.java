package ru.otus.tasks;

import java.util.Calendar;

public class MainUser {
    public static void main(String[] args) {
        //User user = new User("Бэггинс", "Фродо", "Бильбович", 2968);

        final int ageForCompare = 40;


        User[] users = {
                new User("Бэггинс", "Фродо", "Бильбович", 1958, "our_hike@middleearth.lotr"),
                new User("Гэмджи", "Сэмуайз", "Хэмфастович", 1990),
                new User("Брендибак", "Мерриадок", "", 1995),
                new User("Тук", "Перегрин", "Сарадокович", 1988),
                new User("Дунэдайнов", "Арагорн", "Араторнович", 1850),
                new User("Нуменоров", "Боромир", "Дэнеторович", 1985),
                new User("Лихолесьев", "Леголас", "Трандуилович", 1400),
                new User("Длиннобородый", "Гимли", "Глоинович", 1990),
                new User("Истари", "Гендальф", "Майарович", 1000),
                new User("Истари", "Саруман", "Майарович", 1000)
//                new User("", "Элронд", "", 543),
        };

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
//        int dateBirth = 0;

        for (int i = 0; i < 10; i++){
//            dateBirth = users[i].getBirthYear();
            if(year - users[i].getBirthYear() >= ageForCompare) {
                users[i].getUserInfo();
//                System.out.println();
            }
        }

    }
}
