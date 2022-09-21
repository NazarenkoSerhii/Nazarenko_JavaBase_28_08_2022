package com.hillel.nazarenko.lessons.lessons7.homework7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int length = 25;
        int[] team1 = new int[length];
        int[] team2 = new int[length];

        for (int a = 0; a < length; a++) {
            team1[a] = (int) ((Math.random() * 41));
            team2[a] = (int) ((Math.random() * 41));
            if (team1[a] < 18 || team2[a] < 18) {
                a--;
            }
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        int team1Age = 0;
        int team2Age = 0;
        for (int a = 0; a < length; a++) {
            team1Age += team1[a];
            team2Age += team2[a];
        }
        System.out.println("Средний возраст команды 1 : " + (double) team1Age / length);
        System.out.println("Средний возраст команды 2 : " + (double) team2Age / length);
    }
}