package com.hillel.nazarenko.lessons.lessons15.homework14;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("call from android");
    }

    @Override
    public void sms() {
        System.out.println("sms from android");
    }

    @Override
    public void internet() {
        System.out.println("internet from android");
    }

    @Override
    public void getLinuxOS() {
        System.out.println("Linux OS version 16");
    }
}