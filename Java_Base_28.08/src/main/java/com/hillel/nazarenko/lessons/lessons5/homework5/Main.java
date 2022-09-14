package com.hillel.nazarenko.lessons.lessons5.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String teamName1, teamName2;
        int counTer1 = 0, counTer2 = 0, counTer3 = 0, counTer4 = 0, counTer5 = 0;
        int ter1 = 0, ter2 = 0, ter3 = 0, ter4 = 0, ter5 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter Team name 1 : ");
        teamName1 = scanner.nextLine();

        System.out.println(" Please enter the number of Counter-Terrorists1 frags : ");
        if (scanner.hasNextInt()) {
            counTer1 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Counter-Terrorists2 frags : ");
        if (scanner.hasNextInt()) {
            counTer2 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Counter-Terrorists3 frags : ");
        if (scanner.hasNextInt()) {
            counTer3 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Counter-Terrorists4 frags : ");
        if (scanner.hasNextInt()) {
            counTer4 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Counter-Terrorists5 frags : ");
        if (scanner.hasNextInt()) {
            counTer5 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println(" Please enter Team name 2 : ");
        teamName2 = scanner.nextLine();

        System.out.println(" Please enter the number of Terrorists1 frags : ");
        if (scanner.hasNextInt()) {
            ter1 = scanner.nextInt();
            System.out.println(ter1);
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Terrorists2 frags : ");
        if (scanner.hasNextInt()) {
            ter2 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Terrorists3 frags : ");
        if (scanner.hasNextInt()) {
            ter3 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Terrorists4 frags : ");
        if (scanner.hasNextInt()) {
            ter4 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        System.out.println(" Please enter the number of Terrorists5 frags : ");
        if (scanner.hasNextInt()) {
            ter5 = scanner.nextInt();
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }

        double averageTeam1 = ((double) counTer1 + counTer2 + counTer3 + counTer4 + counTer5) / 5;
        double averageTeam2 = ((double) ter1 + ter2 + ter3 + ter4 + ter5) / 5;

        if (averageTeam1 > averageTeam2) {
            System.out.println(" Win team - " + "'" + teamName1 + "'" + " score : " + averageTeam1 + " points ");
        } else if (averageTeam1 < averageTeam2) {
            System.out.println(" Win team - " + "'" + teamName2 + "'" + " score : " + averageTeam2 + " points ");
        } else {
            System.out.println(" A draw! ");
        }
        scanner.close();

    }


}