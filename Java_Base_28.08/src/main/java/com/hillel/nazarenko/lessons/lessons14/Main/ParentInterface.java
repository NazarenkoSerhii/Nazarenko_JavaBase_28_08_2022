package com.hillel.nazarenko.lessons.lessons14.Main;

public interface ParentInterface {

    void demoParent();

    default void demoDefaultParent() {
        System.out.println("from parent");
    }

    default void demoDefault() {
        System.out.println("do default from parent");
    }

}