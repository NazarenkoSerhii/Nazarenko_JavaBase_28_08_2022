package com.hillel.nazarenko.lessons.lessons4.homework4;

public class Main {
    public static void main(String[] args) {
        int lyWar = 13, lyArch = 24, lyHors = 46;
        int mynWar = 9, mynArch = 35, mynHors = 12;
        int war = 860;
        final double coef = 1.5;
        System.out.println(" Attack Power Ly : " + (lyWar + lyArch + lyHors) * war);
        System.out.println(" Attack Power Myn : " + (mynWar + mynArch + mynHors) * (int) (war * coef));

    }


}
