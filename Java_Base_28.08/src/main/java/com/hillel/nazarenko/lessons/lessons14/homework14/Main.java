package com.hillel.nazarenko.lessons.lessons14.homework14;

public class Main {
    public static void main(String[] args) {

        Iphones iphones = new Iphones("Iphone 14 Pro Max", "16");
        iphones.model();
        iphones.iOS();
        iphones.call();
        iphones.sms();
        iphones.internet();

        System.out.println();

        Androids androids = new Androids("Xiaomi 12T Pro", "12");
        androids.model();
        androids.linuxOS();
        androids.call();
        androids.sms();
        androids.internet();
    }
}
