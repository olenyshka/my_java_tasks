package ru.otus.tasks.dz06;

public class User {
    private String lastName;

    private String firstName;

    private String surName;

    private final int birthYear;    //если это только год рождения то birthYear  дата рождения не поменяется. Делаем final

    private String email;

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getSurName(){
        return surName;
    }

//    public void setBirthYear(int birthYear){      //удаляем класс. Дата рождения обычно не меняется
//        this.birthYear = birthYear;
//    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public User(String lastName, String firstName, String surName, int birthYear){
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.birthYear = birthYear;
    }

    public User(String lastName, String firstName, String surName, int birthYear, String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.birthYear = birthYear;
        this.email = email;
    }



    public void getUserInfo(){
        System.out.println("ФИО: " + lastName + " " + firstName + " " + surName + ". Год рождения: " + birthYear + " email: " + email);  //+ "\n"
//        System.out.println("Год рождения:\t" + birthYear);
//        System.out.println("email:\t" + email);
    }





}
