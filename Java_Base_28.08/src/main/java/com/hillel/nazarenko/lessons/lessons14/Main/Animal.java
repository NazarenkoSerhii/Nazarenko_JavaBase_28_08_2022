package com.hillel.nazarenko.lessons.lessons14.Main;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void sayHello();

    public String getName() {
        return name;
    }
}