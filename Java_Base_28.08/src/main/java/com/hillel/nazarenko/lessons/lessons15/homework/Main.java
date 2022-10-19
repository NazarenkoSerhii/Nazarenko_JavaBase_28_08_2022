package com.hillel.nazarenko.lessons.lessons15.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        runMachine();
    }

    static void runMachine() {

        int counterDrink = 0;
        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        while (true) {
            DrinksMachine drinksMachine = null;
            System.out.println("Введите название напитка из списка " + Arrays.toString(drinksMachines) +
                    " или напишите NO ");

            while (true) {
                String choice = scanner.nextLine().toUpperCase();
                if (choice.equals("NO")) {
                    System.out.println("Общая цена за " + counterDrink + " шт. " + Drinks.totalCheck + " денег ");
//                    System.out.println("Общее количество напитков " + counterDrink + " шт. " );
                    System.exit(0);
                }
                for (DrinksMachine drinks : drinksMachines) {
                    if (choice.equals(drinks.toString())) {
                        drinksMachine = DrinksMachine.valueOf(choice);
                        break;
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите правильное название! ");

                }
            }
            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("Напиток " + DrinksMachine.COFFEE.drinkName +
                            " готовится, стоимость " + Drinks.getPriceCoffee());
                    counterDrink++;
                    Drinks.totalCheck += Drinks.getPriceCoffee();
                }
                case TEA -> {
                    System.out.println("Напиток " + DrinksMachine.TEA.drinkName +
                            " готовится, стоимость " + Drinks.getPriceTEA());
                    counterDrink++;
                    Drinks.totalCheck += Drinks.getPriceTEA();
                }
                case LEMONADE -> {
                    System.out.println("Напиток " + DrinksMachine.LEMONADE.drinkName +
                            " готовится, стоимость " + Drinks.getPriceLEMONAD());
                    counterDrink++;
                    Drinks.totalCheck += Drinks.getPriceLEMONAD();
                }
                case MOJITO -> {
                    System.out.println("Напиток " + DrinksMachine.MOJITO.drinkName +
                            " готовится, стоимость " + Drinks.getPriceMOJITO());
                    counterDrink++;
                    Drinks.totalCheck += Drinks.getPriceMOJITO();
                }
                case MINERALWATER -> {
                    System.out.println("Напиток " + DrinksMachine.MINERALWATER.drinkName +
                            " готовится, стоимость " + Drinks.getPriceMINERALWATER());
                    counterDrink++;
                    Drinks.totalCheck += Drinks.getPriceMINERALWATER();
                }
                case COCACOLA -> {
                    System.out.println("Напиток " + DrinksMachine.COCACOLA +
                            " готовится, стоимость " + Drinks.getPriceCOCACOLA());
                    counterDrink++;
                    Drinks.totalCheck += Drinks.getPriceCOCACOLA();
                }
            }

        }

    }
}












