package com.hillel.nazarenko.lessons.lessons8.homework8;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int lenght = 7;
        int loto[] = new int[lenght];
        int gamer[] = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            loto[i] = (int) (Math.random() * 10);
            gamer[i] = (int) (Math.random() * 10);
        }
        int tempL = 0;
        int tempG = 0;

        for (int l = 0; l < lenght; l++) {
            for (int j = 0; j < lenght - 1 - l; j++) {
                if (loto[j] > loto[j + 1]) {
                    tempL = loto[j];
                    loto[j] = loto[j + 1];
                    loto[j + 1] = tempL;
                }
            }
            for (int k = 0; k < lenght - 1 - l; k++) {
                if (gamer[k] > gamer[k + 1]) {
                    tempG = gamer[k];
                    gamer[k] = gamer[k + 1];
                    gamer[k + 1] = tempG;
                }
            }
        }
        System.out.println(Arrays.toString(loto));
        System.out.println(Arrays.toString(gamer));
        System.out.print("Совпадения : ");
        for (int i = 0; i < lenght; i++) {
            if (loto[i] == gamer[i]) {
                System.out.print((i + 1) + " -й элемент ");
            } else {
                continue;
            }
        }
    }
}
