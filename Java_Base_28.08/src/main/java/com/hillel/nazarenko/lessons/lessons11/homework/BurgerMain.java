package com.hillel.nazarenko.lessons.lessons11.homework;

public class BurgerMain {
    public static void main(String[] args) {

        Burger originalBurger = new Burger("Булочка,", "Мясо,", "Зелень,", "Сыр,",
                "Майонез.");
        System.out.println();
        Burger dietBurger = new Burger("Булочка,", "Мясо,", "Зелень,", "Сыр.");
        System.out.println();
        Burger doubleMeatBurger = new Burger("Булочка,", "Мясо,", "Дополнительное Мясо,",
                "Зелень,", "Сыр,", "Майонез.");


    }


}



