package com.hillel.nazarenko.lessons.lessons9;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ////
////        array[0][0] = 11;
////
////        array[4][2] = 99;
//
////        int[][] array = {                                    // Правильная матрица (правильный массив)
////                {10, 11, 12, 13},
////                {20, 21, 22, 23},
////                {30, 31, 32, 33}
////
////        };
////
////
////        System.out.println(array.length);
////
////        System.out.println(array[0].length);
////
//////        System.out.println(Arrays.deepToString(array));      // Печать  2-х мерного массива (правильная матрица)
////                                                               // в одну строку

////        for (int i = 0; i < array.length; i++) {               // Печать  2-х мерного массива
////            for (int j = 0; j < array[i].length; j++) {        // в виде матрицы с помощью цикла
////                System.out.print(array[i][j] + " \t");
////            }
////            System.out.println();
////        }
//
//
////        int[][] array = {                                           // Зубчатый массив
////                {10, 11, 12, 13},
////                {20},
////                {30, 31},
////                {23, 234, 54, 76, 67, 87, 76},
////                {},
////                {30, 31, 77}
////
////        };
////
////        System.out.println(array[0].length);                      // Длина рядков
////        System.out.println(array[1].length);
////        System.out.println(array[2].length);
////        System.out.println(array[3].length);
////        System.out.println(array[4].length);
////        System.out.println(array[5].length);
////
////        for (int i = 0; i < array.length; i++) {                 //  Печать  2-х мерного зубчатого массива
////            for (int j = 0; j < array[i].length; j++) {
////                System.out.print(array[i][j] + " \t");
////            }
////            System.out.println();
////        }
//


////        int[][] array = new int[9][1];
////
////        System.out.println(Arrays.deepToString(array));
//
//



////        int[][][] array = new int[3][2][4];                               //3-х мерный массив
////        int[][][] array = {                                               // 3.png
////                {
////                        {18, 28, 18, 28},
////                        {45, 90, 45, 0}
////                },
////                {
////                        {7, 125, 500, 5},
////                        {0, 11, 25, 30}
////                },
////                {
////                        {81, 17, 19, 55},
////                        {1, 7, 38, 11}
////                }
////        };
//////        System.out.println(Arrays.deepToString(array));          // Печать 3-х мерного массива в одну строку
//////        System.out.println(array.length);                        // Печать кол-во массивов(площадей)
//////        System.out.println(array[0].length);                     // Печать кол-во строк (в 2-х мерному)
//////        System.out.println(array[0][0].length);                  // Печать кол-во столбцов (в 2-х или 1 мерному)
////
////        for (int i = 0; i < array.length; i++) {                   // Печать 3-х мерного в виде матрицы
////            for (int j = 0; j < array[i].length; j++) {
////                for (int k = 0; k < array[i][j].length; k++) {
////                    System.out.print(array[i][j][k] + "\t");
////                }
////                System.out.println();
////            }
////            System.out.println();
////        }
////

////        System.out.println();                                      // Печать конкретной ячейки
////        System.out.println();
////        System.out.println(array[1][1][3]);
//
//


////        traspon();
//
//
////        task1();
////        task2();
//
//
//    int[] array1 = {1, 2, 3, 4};                                                // Динамический массив
//    int[] array2 = {5, 6, 7, 8};
//
////        int[] array3 = demo(array1, array2);
//
////        int[] array3 =  new int[array1.length + array2.length];
////        for (int i = 0; i < array1.length; i++) {
////            array3[i] = array1[i];
////        }
////        for (int i = 0; i < array2.length; i++) {
////            array3[array1.length + i] = array2[i];
////        }
////
////        System.out.println(Arrays.toString(array3));
//
//    array1 = demoVersion2(array1, 1, 5, 76, 88, 11, 1324, 234, 23, 23, 23, 45, 65);
//        System.out.println(Arrays.toString(array1));
//
//    array1 = demo2(array1, 4);
//        System.out.println(Arrays.toString(array1));
//}

                                                                                 // Трансронирование матрицы
//    static void traspon() {                                                //Поменять местами строки и столбцы
//
//        int[][] array = new int[5][5];
//
//        int counter = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = counter;
//                counter++;
//            }
//        }
//
//        System.out.println("BEFORE");                                  // Печать до трансронирования
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array[i].length; j++) {
//                int temp = array[i][j];
//                array[i][j] = array[j][i];
//                array[j][i] = temp;
//            }
//        }
//
//        System.out.println("AFTER");                                   // Печать после
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//    }
//
//
//    static int[] demo(int[] source, int... target) {
//        int[] array = new int[source.length + target.length];
//        for (int i = 0; i < source.length; i++) {
//            array[i] = source[i];
//        }
//        for (int i = 0; i < target.length; i++) {
//            array[source.length + i] = target[i];
//        }
//
//        return array;
//    }
//
//    static int[] demoVersion2(int[] source, int... target) {
//        int[] array = new int[source.length + target.length];
//        System.arraycopy(source, 0, array, 0, source.length);
//        System.arraycopy(target, 0, array, source.length, target.length);
//        return array;
//    }
//
//    static int[] demo2(int[] source, int length) {
//        int[] array = new int[length];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = source[i];
//        }
//        return array;
//    }
//
//
//// Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким              // Задания 2-х мерный массив
//// чином, щоб одиниця у кожному рядку зміщувалась вправо:
//
////      1 0 0 0 0       // 0 0
////      0 1 0 0 0       // 1 1
////      0 0 1 0 0       // 2 2
////      0 0 0 1 0       // 3 3
////      0 0 0 0 1       // 4 4
//
////      0 0 0 0 1       // 0 4
////      0 0 0 1 0       // 1 3
////      0 0 1 0 0       // 2 2
////      0 1 0 0 0       // 3 1
////      1 0 0 0 0       // 4 0
//
//    static void task1() {
//
//        int[][] array = new int[5][5];                                 // Вперед по диагонали
//
//        // Variant 1
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[i].length; j++) {
////                if (i == j) {
////                    array[i][j] = 1;
////                }
////            }
////        }
//
//        // Variant 2                                                    // Вперед по диагонали Лучщий
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//        }
//
//        // Variant 1                                                               // Назад по диагонали 1
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[i].length; j++) {
////                if (i + j == array.length -1) {
////                    array[i][j] = 1;
////                }
////            }
////        }
//        // Variant 2                                                             // Назад по диагонали 2 Лучший
////        for (int i = 0, j = array.length -1; i < array.length; i++, j--) {
////            if (i + j == array.length -1) {
////                array[i][j] = 1;
////            }
////        }
//        // Variant 3                                                           // Назад по диагонали 3
//        for (int i = 0; i < array.length; i++) {
//            array[i][array[i].length - i - 1] = 1;
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " \t");
//            }
//            System.out.println();
//        }
//    }
//


//
////      За допомогою циклів створити шахівницю 8х8 виду:
////
////      B W B W B W B W  // 00, 02, 04, 06 - 0, 2, 4, 6
////      W B W B W B W B  // 11, 13, 15, 17 - 2, 4, 6, 8
////      B W B W B W B W  // 20, 22, 24, 26 - 2, 4, 6, 8
////      W B W B W B W B  // 31, 33, 35, 37 - 4, 6, 8, 10
////      B W B W B W B W
////      W B W B W B W B
////      B W B W B W B W
////      W B W B W B W B
//
//    static void task2() {
//
//        String[][] array = new String[8][8];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
////                if ((i + j) % 2 == 0) {                           // Проверка на парность (если делится на 2)
////                    array[i][j] = "B";
////                } else {
////                    array[i][j] = "W";
////                }
//
//                array[i][j] = ((i + j) % 2 == 0) ? "B" : "W";      // Тренарный оператов Лучший
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " \t");
//            }
//            System.out.println();
//
    }
}
