package com.hillel.nazarenko.lessons.lessons13.obstract.lessons8;

public class homework6_7 {
    public static void main(String[] args) {
//import java.util.Arrays;
//
//        public class Homework {
//            public static void main(String[] args) {
//
////        int[] team = new int[25];
////
////        for (int i = 0; i < team.length; i++) {
////            team[i] = (int) (Math.random() * 23) + 18;
////        }
////
////        System.out.println(team[0]);
////        System.out.println(team[team.length - 1]);
////
////        System.out.println(Arrays.toString(team));
////
////        for (int i = 0; i < team.length; i++) {
////            System.out.print(team[i] + ", ");
////        }
//
//
//// Variant 1
////        int counter = 0;                                              //    универсальный метод
////        for (int i = 4444; counter < 100; i++) {
////            if (!(String.valueOf(i).contains("4") || String.valueOf(i).contains("9"))) {
////                System.out.println("number: " + i);
////                counter++;
////            }
////        }
////        System.out.println("counter = " + counter);
//

////        int counter = 0;
////        for (int i = 1; counter < 100; i++) {
////            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
////                continue;
////            } else {
////                System.out.println("number: " + i);
////                counter++;
////            }
////        }
////        System.out.println("counter = " + counter);
//
//// Variant 2
//                int counter = 0;
//                for (int i = 5123; counter < 100; i++) {
//
//                    int number = i;
//                    int result = number % 10;
//                    boolean ok = true;
//
//                    do {
//                        if (result == 4 || result == 9) {
//                            ok = false;
//                            break;
//                        }
//                        number /= 10;
//                        result = number % 10;
//                    } while (number > 0);
//
//                    if (ok) {
//                        System.out.println("number: " + i);
//                        counter++;
//                    }
//                }


                // Variant 3
//        int counter = 0;
//        for (int i = 1; counter < 100 ; i++) {
//            if (checkNumber(i)) {
//                System.out.println("number: " + i);
//                counter++;
//            }
//        }

            }

//    static boolean checkNumber(int number) {
//        int result = number % 10;
//        do {
//            if (result == 4 || result == 9) {
//                return false;
//            }
//            number /= 10;
//            result = number % 10;
//        } while (number > 0);
//        return true;
//    }
        }

