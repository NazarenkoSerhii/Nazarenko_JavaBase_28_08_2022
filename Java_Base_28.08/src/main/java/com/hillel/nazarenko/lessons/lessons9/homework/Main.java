package com.hillel.nazarenko.lessons.lessons9.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = 0, n = 0;
        System.out.println("Введите значение матрицы M от 1 до 10  ");

        while (true) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
            }
            if (m > 10 || m <= 0) {
                System.out.println("Ошибка! Введите числовое значение от 1 до 10 ");
                scanner.hasNextInt();
                scanner.nextLine();
            } else {
                break;
            }
        }

        System.out.println("Введите значение матрицы N от 1 до 10  ");
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            if (n > 10 || n <= 0) {
                System.out.println("Ошибка! Введите числовое значение от 1 до 10 ");
                scanner.hasNextInt();
                scanner.nextLine();
            } else {
                break;
            }
        }

        int[][] matrix = new int[m][n];
        int[][] matrixT = new int[n][m];

        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }

        System.out.println("До транспонирования матрица M*N ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }

        System.out.println("После транспонирования матрица N*M ");
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                System.out.print(matrixT[i][j] + "\t");
            }
            System.out.println();
        }
    }
}















