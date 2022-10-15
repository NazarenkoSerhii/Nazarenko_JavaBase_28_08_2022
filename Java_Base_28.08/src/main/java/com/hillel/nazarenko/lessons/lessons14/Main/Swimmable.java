package com.hillel.nazarenko.lessons.lessons14.Main;

public interface Swimmable {             // Интерфейс может иметь только Abstract method

    int distance = 100;               // по умолчанию  в интерфейсе Public static final

    void swim();                      // методы по умолчанию  в интерфейсе Abstract

    default void demoDefault() {        // можно добавить только Default method
        System.out.println("do default ");
    }

}