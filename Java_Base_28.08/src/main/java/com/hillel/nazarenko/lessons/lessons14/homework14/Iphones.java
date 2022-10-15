package com.hillel.nazarenko.lessons.lessons14.homework14;

public class Iphones implements Smartphones, IOS {
    private String iphone;
    private String versionOS;


    public Iphones(String iphone, String versionOS) {
        this.iphone = iphone;
        this.versionOS = versionOS;
    }

    public void model() {
        System.out.println(iphone);
    }


    public String getIphone() {
        return iphone;
    }

    public String getVersionOS() {
        return versionOS;
    }

    @Override
    public void call() {
        System.out.println("Call ");
    }

    @Override
    public void sms() {
        System.out.println("SMS ");
    }

    @Override
    public void internet() {
        System.out.println("Internet ");
    }

    @Override
    public void iOS() {
        System.out.println("Version iOS " + versionOS);
    }
}

