package com.hillel.nazarenko.lessons.lessons15.homework14;

public class Main {
    public static void main(String[] args) {

//        Androids android = new Androids();
//        android.call();
//        android.sms();
//        android.internet();
//        android.getLinuxOS();

        System.out.println();
        System.out.println();

        IPhones iPhone = new IPhones("Iphone ", "14");
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.getIOS();

    }
}