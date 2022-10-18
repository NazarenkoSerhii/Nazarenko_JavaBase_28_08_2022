package com.hillel.nazarenko.lessons.lessons15.nested;

public class Car {

    private String model;
    private static int domeStatic;

    public Door door = new Door();

    public Car(String model) {
        this.model = model;
    }

    public void demo() {

        class LocalClass {
            public String name = "Den";
        }

        LocalClass localClass = new LocalClass();
        System.out.println(localClass.name);
    }

    class Door  {
        public String someVariableNestedClass;
        void rollUp() {
            System.out.println(model);
            System.out.println(domeStatic);
        }
        void rollDown() {

        }
    }

    static class Engine {

        public static double volume = 5.5;

        void start() {
            System.out.println("starting...");
            System.out.println(domeStatic);
        }
    }



}