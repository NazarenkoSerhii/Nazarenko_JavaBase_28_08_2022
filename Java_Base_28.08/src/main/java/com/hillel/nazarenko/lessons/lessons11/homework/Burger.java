package com.hillel.nazarenko.lessons.lessons11.homework;

public class Burger {
    String burgerBun;
    String meat;
    String extraMeat;
    String greens;
    String cheese;
    String mayonnaise;

    public Burger(String burgerBun, String meat, String greens, String cheese, String mayonnaise) {
        System.out.println("Original Burger ");
        System.out.print("Ingredients : ");
        this.burgerBun = burgerBun;
        this.meat = meat;
        this.greens = greens;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println(burgerBun + " " + meat + " " + greens + " " + cheese + " " + mayonnaise);
    }

    public Burger(String burgerBun, String meat, String greens, String cheese) {
        System.out.println("Diet burger ");
        System.out.print("Ingredients : ");
        this.burgerBun = burgerBun;
        this.meat = meat;
        this.greens = greens;
        this.cheese = cheese;
        System.out.println(burgerBun + " " + meat + " " + greens + " " + cheese);
    }

    public Burger(String burgerBun, String meat, String extraMeat, String greens, String cheese, String mayonnaise) {
        System.out.println("Double meat burger ");
        System.out.print("Ingredients : ");
        this.burgerBun = burgerBun;
        this.meat = meat;
        this.extraMeat = extraMeat;
        this.greens = greens;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println(burgerBun + " " + meat + " " + " " + extraMeat + " " + greens + " " + cheese +
                " " + mayonnaise);
    }
}











