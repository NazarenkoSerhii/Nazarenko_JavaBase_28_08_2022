package com.hillel.nazarenko.lessons.lessons2.homework2;

public class EiffelTower {
    public static void main(String[] args) {

        double n = 48.858257;
        double e = 2.294511;
        System.out.println("Координаты объекта (десятичные градусы) : " + n + " N " + " " + e + " E ");
        System.out.println();

        int north = 48;
        char north1 = '\u00B0';
        int north2 = 51;
        char north3 = '\'';
        double north4 = 29.7;
        char north5 = 'N';
        System.out.println("Градусы, минуты и секунды: ");
        System.out.println("" + north + north1 + " " + north2 + north3 + " " + north4 + north3 + north3 + " " + north5);

        int east = 2;
        char east1 = '\u00B0';
        int east2 = 17;
        char east3 = '\'';
        double east4 = 40.2;
        char east5 = 'E';
        System.out.println("" + east + east1 + " " + east2 + east3 + " " + east4 + east3 + east3 + " " + east5);


    }
}
