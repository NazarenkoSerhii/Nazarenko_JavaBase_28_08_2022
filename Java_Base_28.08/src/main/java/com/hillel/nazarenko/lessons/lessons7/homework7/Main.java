package com.hillel.nazarenko.lessons.lessons7.homework7;

public class Main {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        for (int a = 0; a < team1.length; a++) {
            team1[a] = (int) ((Math.random() * 41));
            if (team1[a] < 18) {
                a--;
            } else {
                System.out.print(team1[a] + "  ");
            }
        }
        System.out.println();
        for (int b = 0; b < team2.length; b++) {
            team2[b] = (int) ((Math.random() * 41));
            if (team2[b] < 18) {
                b--;
            } else {
                System.out.print(team2[b] + "  ");
            }
        }
        System.out.println();
        int team1Age = 0;
        int team2Age = 0;
        for (int a = 0; a < team1.length; a++) {
            team1Age += team1[a];
        }
        System.out.println("Средний возраст команды 1 : " + team1Age / team1.length);

        for (int b = 0; b < team1.length; b++) {
            team2Age += team2[b];
        }
        System.out.println("Средний возраст команды 2 : " + team2Age / team2.length);


    }
}