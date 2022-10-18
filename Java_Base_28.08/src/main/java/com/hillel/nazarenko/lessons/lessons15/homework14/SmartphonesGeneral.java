package com.hillel.nazarenko.lessons.lessons15.homework14;

public abstract class SmartphonesGeneral implements Smartphones {
    private final String name;
    private String model;

    protected SmartphonesGeneral(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}