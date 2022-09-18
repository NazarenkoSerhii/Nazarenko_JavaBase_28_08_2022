package com.hillel.nazarenko.lessons.lessons7;

//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[5];

//        int[] array2 = new int[]{1, 2, 3, 4, 5};
//
//        int[] array3 = {1, 2, 3, 4, 5};
//
//        int array4[] = new int[5];

//        System.out.println("length = " + array.length);
//        System.out.println(array[0]);
//        array[0] = 11;
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);


//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }

//        for (int i = 0; i < array2.length; i++) {
//            System.out.println("index = " + i + ", value = " + array2[i]);
//        }

//        int sum = 0;
//        for (int value : array2) {
//            System.out.println(value);
//            sum += value;
//        }


// створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
// вивести на екран в один рядок усі цифри, розділивши їх комою, але у
// останнього символу не виводити кому

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//            if (i == array.length - 1) {
//                System.out.print(array[i]);
//            } else {
//                System.out.print(array[i] + ", ");
//            }
//
//            if (i < array.length - 1) {
//                System.out.print(array[i] + ", ");
//            } else {
//                System.out.print(array[i]);
//            }
//        }


 /*
     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.
*/

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 101);
//        }
//
//        System.out.println(Arrays.toString(array));
//
//        int max = array[0];
//        int index = 0;
//
//        for (int i = 1; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//                index = i;
//            }
//        }
//
//        System.out.println("index :" + index +", chance: " + max);


//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = array; // BAD COPY!!!!!
//
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 99;
//        array[1] = 77;
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));



/*
     У вашій баскетбольній команді 10 людей. Очки гравців основного
     складу записані в парні комірки масиву, а запасних гравців - у
     непарні. Написати функцію, яка знайде наскільки більше балів
     заробив основний склад щодо запасних гравців.
*/

//        int[] team = new int[10];
//
//        int sumMain = 0;
//        int sumReserve = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 11);
//
//            if (i % 2 == 0) {
//                sumMain += team[i];
//            } else {
//                sumReserve += team[i];
//            }
//        }
//        System.out.println(Arrays.toString(team));
//
//        System.out.println("main team : " + sumMain);
//        System.out.println("reserve team: " + sumReserve);
//
//        if (sumMain == sumReserve) {
//            System.out.println("DRAW");
//        } else if (sumMain > sumReserve) {
//            System.out.println("team Main scored " + (sumMain - sumReserve) + " points more then team Reserve");
//        } else {
//            System.out.println("team Reserve scored " + (sumReserve - sumMain) + " points more then team Main");
//        }
//
//    }
//}
