package com.hillel.nazarenko.lessons.lessons12.homework;

public class User {

    private final String userName;
    private final int day, month, year;
    private final String email;
    private final String phoneNumber;

    private int age;
    private String surName;
    private int weight;
    private String arterialPressure;
    private int pedometer;

    public User(String userName, int day, int month, int year, String email, String phoneNumber,
                String surName, int weight, String arterialPressure, int pedometer, int age) {
        this.userName = userName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surName = surName;
        this.weight = weight;
        this.arterialPressure = arterialPressure;
        this.pedometer = pedometer;
        this.age = 2020 - year;
    }
    public void printAccountInfo() {
        System.out.println(this);
    }

    public String getUserName() {
        return userName;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getAge() {
        return age;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setArterialPressure(String arterialPressure) {
        this.arterialPressure = arterialPressure;
    }
    public void setPedometer(int pedometer) {
        this.pedometer = pedometer;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", surName='" + surName + '\'' +
                ", weight=" + weight +
                ", arterialPressure='" + arterialPressure + '\'' +
                ", pedometer=" + pedometer +
                '}';
    }
}





