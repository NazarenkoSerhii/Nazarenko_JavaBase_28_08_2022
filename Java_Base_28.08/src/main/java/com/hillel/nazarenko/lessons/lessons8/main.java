package com.hillel.nazarenko.lessons.lessons8;

public class main {
//    import java.util.Arrays;
//    import java.util.Collections;
//    import java.util.Scanner;
//
//    public class Main {
//
//        public static void main(String[] args) {
//
////        // O(N)
////        for (int i = 0; i < 50; i++) {
////
////        }
////
////        int counter = 0;
////        // O(N) * O(N) = O(N^2)
////        for (int i = 0; i < 5; i++) {
////            for (int j = 0; j < 3; j++) {
////                counter++;
////            }
////        }
////        System.out.println(counter);
////
////
////        counter = 0;
////        // O(N) * O(N) * O(N) = O(N^3)
////        for (int i = 0; i < 5; i++) {
////            for (int j = 0; j < 3; j++) {
////                for (int k = 0; k < 20; k++) {
////                    counter++;
////                }
////            }
////        }
////        System.out.println(counter);
//
//



////        Integer[] array = {5, 13, 54, 6, 1, 87, -7, 3, 7};
////
////        Arrays.sort(array, Collections.reverseOrder());               // Класс сортировки - только
                                                                          // референсный тип данных
////
////
////        System.out.println(Arrays.toString(array));
//                                                                       // сортировка пузырьком 1
////        int counter = 0;
////        int temp = 0;
////        boolean sort = false;
////        while (!sort) {
////            sort = true;
////            for (int i = 0; i < array.length - 1; i++) {
////                counter++;
////                if (array[i] > array[i + 1]) {
////                    sort = false;
////                    temp = array[i];
////                    array[i] = array[i + 1];
////                    array[i + 1] = temp;
////                }
////            }
////        }
////
////        System.out.println(Arrays.toString(array));
////        System.out.println(counter);
//

                                                                             // сортировка пузырьком 2
////        int counter = 0;
////        int temp = 0;
////
////        for (int i = 0; i < array.length - 1; i++) {
////            for (int j = 0; j < array.length - 1 - i; j++) {
////                counter++;
////                if (array[j] > array[j + 1]) {
////                    temp = array[j];
////                    array[j] = array[j + 1];
////                    array[j + 1] = temp;
////                }
////            }
////        }
////
////        System.out.println(Arrays.toString(array));
////        System.out.println(counter);
//
//
////        demoLogN(array, 13);
//
//



//            //---------------- COPY ARRAY ------------------
//
////        int[] array1 = {1, 2, 3, 4, 5};
////        int[] array2 = Arrays.copyOf(array1, 15);
////
////        System.out.println(Arrays.toString(array1));
////        System.out.println(Arrays.toString(array2));
////
////        System.out.println();
////        array2[0] = 99;
////
////        System.out.println(Arrays.toString(array1));
////        System.out.println(Arrays.toString(array2));
////
////
////        int[] array3 = new int[5];
////        System.arraycopy(array1, 3, array3, 3, 2);
////
////        System.out.println();
////        System.out.println();
////        System.out.println(Arrays.toString(array3));
//
////        int[] array4 = Arrays.copyOfRange(array1, 1, array1.length);
////        System.out.println(Arrays.toString(array4));
//
//

                                                                            // поиск по массиву
////        for (int i = 0; i < array1.length; i++) {
////            if (array1[i] == 4) {
////                System.out.println("index = " + i);
////                break;
////            }
////        }
//
//
////        System.out.println(Arrays.binarySearch(array1, 222));          // бинарный поиск
//
//            // Створити масив із N чисел (вводимо з консолі)
//            // Розбити його на 2 масиви рівної довжини
//            // Відсортувати першу половину масиву за зростанням та вивести на екран
//            // другу половину масиву відсортувати у зворотному порядку і теж вивести на екран
//
//
//            int N = -1;
//
//            Scanner scanner = new Scanner(System.in);
//
//            do {
//                if (scanner.hasNextInt()) {
//                    N = scanner.nextInt();
//                    scanner.nextLine();
//                    if (N >= 0 && N % 2 == 0) {
//                        break;
//                    } else {
//                        System.out.println("Please enter positive integer and % 2 === 0");
//                    }
//                } else {
//                    System.out.println("Wrong data, try again!");
//                    scanner.nextLine();
//                }
//            } while (true);
//
//
//            Integer[] source = new Integer[N];
//
//            for (int i = 0; i < source.length; i++) {
//                source[i] = (int) (Math.random() * 51);
//            }
//
//            System.out.println(Arrays.toString(source));
//            System.out.println();
//            int middle = source.length / 2;
//
//            Integer[] array1 = Arrays.copyOf(source, middle);
//            Integer[] array2 = Arrays.copyOfRange(source, middle, source.length);
//
//            System.out.println(Arrays.toString(array1));
//            System.out.println(Arrays.toString(array2));
//
//            Arrays.sort(array1);
//            Arrays.sort(array2, Collections.reverseOrder());
//
//            System.out.println();
//            System.out.println();
//            System.out.println(Arrays.toString(array1));
//            System.out.println(Arrays.toString(array2));
//        }
//
//
//        /**
//         * O(logN)
//         * Самый худший вариант для массива из 16 элементов
//         * N = 16 - 2^4
//         * N = 8 - 2^3
//         * N = 4 - 2^2
//         * N = 2 - 2^1
//         * N = 1 - 2^0
//         * <p>
//         * 2^4=16 - 2^k = N или из математики     k = log2N
//         * O(k) = O(log2N)
//         * Основание логарифма является константой поэтому не играет роли:
//         * O(k) = O(logN)
//         */
//        static int demoLogN(int[] array, int element) {
//
//            int firstIndex = 0;
//            int lastIndex = array.length - 1;
//
//            while (firstIndex <= lastIndex) {
//                int middleIndex = (firstIndex + lastIndex) / 2;
//                if (array[middleIndex] == element) {
//                    return middleIndex;
//                } else if (array[middleIndex] < element) {
//                    firstIndex = middleIndex + 1;
//                } else {
//                    lastIndex = middleIndex - 1;
//                }
//            }
//
//            return -1;
//        }
//
//
//    }
}
