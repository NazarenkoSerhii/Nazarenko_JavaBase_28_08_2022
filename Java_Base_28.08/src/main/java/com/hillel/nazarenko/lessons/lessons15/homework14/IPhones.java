package com.hillel.nazarenko.lessons.lessons15.homework14;

public class IPhones extends SmartphonesGeneral implements Smartphones, IOS {
    protected IPhones(String name, String model) {
        super(name, model);
    }

    @Override
    public void call() {
        System.out.println("call from iphone");
    }

    @Override
    public void sms() {
        System.out.println("sms from iphone");
    }

    @Override
    public void internet() {
        System.out.println("internet from iphone");
    }

    @Override
    public void getIOS() {
        System.out.println("IOS version 20");
    }
}