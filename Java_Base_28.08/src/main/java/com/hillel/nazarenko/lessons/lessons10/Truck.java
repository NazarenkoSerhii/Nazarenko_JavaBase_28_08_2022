package com.hillel.nazarenko.lessons.lessons10;

//    Створити клас Truck
//    b. Додати параметри length, width, height у main-методі
//    c. Додати метод countVolume() для розрахунку обсягу
//    public static int countVolume(int length, int width, int height) {}
//    d. Викликати метод countVolume() у main-методі та передати в нього параметри

public class Truck {
    public static void main(String[] args) {
        int length = 3;
        int width = 4;
        int height = 2;

        countVolume(length, width, height);
    }
    static void countVolume(int length, int width, int height) {
        System.out.println(length * width * height);


    }
}
