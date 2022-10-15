package com.hillel.nazarenko.lessons.lessons14.homework14;

public class Androids implements Smartphones, LinuxOS {
    private String android;
    private String versionOS;

    public Androids(String android, String versionOS) {
        this.android = android;
        this.versionOS = versionOS;
    }

    public void model() {
        System.out.println(android);
    }

    public String getAndroid() {
        return android;
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
    public void linuxOS() {
        System.out.println("Version Android " + versionOS);
    }
}
