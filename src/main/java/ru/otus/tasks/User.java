package ru.otus.tasks;

public class User {
    private String lastName;

    private String firstName;

    private String surName;

    private int dateBirth;

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

    public void setDateBirth(int dateBirth){
        this.dateBirth = dateBirth;
    }

    public int getDateBirth(){
        return dateBirth;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public User(String lastName, String firstName, String surName, int dateBirth){
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.dateBirth = dateBirth;
    }

    public User(String lastName, String firstName, String surName, int dateBirth, String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.dateBirth = dateBirth;
        this.email = email;
    }



    public void getInfoUser(){
        System.out.println("ФИО:\t" + lastName + "\t" + firstName + "\t" + surName);
        System.out.println("Год рождения:\t" + dateBirth);
        System.out.println("email:\t" + email);
    }





}
