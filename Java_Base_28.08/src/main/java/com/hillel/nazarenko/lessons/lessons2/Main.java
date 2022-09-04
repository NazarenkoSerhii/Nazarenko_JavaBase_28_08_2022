package com.hillel.nazarenko.lessons.lessons2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        // Примітиви
        byte age;
        age = 28;
        System.out.println(age);
        age = 29;
        System.out.println(age);

        byte age2 = 35;
        System.out.println(age2);

        byte byteVariable = 20;
        System.out.println(byteVariable);

        short shortVariable = -32700;
        int intVariable = 21274343;
        long longVariable = 982364983453453454L;


        float floatVariable = 1.1111111111111111F;
        double doubleVariable = 1.1111111111111111;

        System.out.println();
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

        System.out.println();

        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = '\u00B0';
        char ch4 = '\u2695';

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);


        boolean booleanTrue = true;
        boolean booleanFalse = false;

        System.out.println(booleanTrue);
        System.out.println(booleanFalse);

//        System.out.println("51° 30' 19.9944'' N");


        // референснi
        String name = "Denys";
        String name2 = "Denys";
        String name3 = "Denys";
        System.out.println(name);


        final int LENGTH = 550;


        byte demoByte = 40;

        short demoShort = demoByte;

        int demoInt = demoShort;

        long demoLong = demoInt;

        System.out.println(demoByte);
        System.out.println(demoShort);
        System.out.println(demoInt);
        System.out.println(demoLong);


        double demoDouble = demoInt;
        System.out.println(demoDouble);

        char demoChar = 'A';
        demoInt = demoChar;
        System.out.println(demoInt);
        System.out.println();
        System.out.println();


        byte byteOver = (byte) 128;

        System.out.println(byteOver);

        System.out.println((byte) 128);
        System.out.println((byte) 129);
        System.out.println((byte) 130);
        System.out.println((byte) 131);
        System.out.println((byte) 255);

        double someDouble = 22.43534543;
        int someInt = (int) someDouble;

        System.out.println(someInt);


        byte a1 = 51;
        char c1 = '\u00B0';
        byte a2 = 30;
        double x1 = 19.9944;
        char c2 = '\'';
        char c3 = 'N';

        System.out.println("51° 30' 19.9944'' N");
        System.out.println("" + a1 + c1 + " " + a2 + c2 + " " + x1 + c2 + c2 + " " + c3);


    }
}

















