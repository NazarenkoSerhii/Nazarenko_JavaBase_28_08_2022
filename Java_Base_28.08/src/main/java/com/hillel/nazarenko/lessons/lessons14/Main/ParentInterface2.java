package com.hillel.nazarenko.lessons.lessons14.Main;

public interface ParentInterface2 {

    default void demoDefaultParent() {
        System.out.println("from parent2");
    }

}