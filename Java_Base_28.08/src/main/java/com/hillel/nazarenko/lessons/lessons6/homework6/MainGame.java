package com.hillel.nazarenko.lessons.lessons6.homework6;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        int numberPC = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Угадайте число, которое загалад компьютер от 0 до 10, у Вас 3 попытки ");
        int number = 0;
        int count = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println(" Ошибка ввода! ");
            }
            scanner.nextLine();
            if (0 > number || number > 10) {
                System.out.println(" Необходимо ввести число от 0 до 10 ");
            }
            if (number == numberPC) {
                System.out.println(" Поздравляем! Вы угадали! \n Game over ");
                System.exit(0);
            }
            count++;
            if (count == 3) {
                System.out.println(" Game over ");
                System.exit(0);
            } else {
                System.out.println(" Попробуйте еще ");
            }
        }
    }
}


















