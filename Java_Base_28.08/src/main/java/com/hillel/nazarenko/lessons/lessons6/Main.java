package com.hillel.nazarenko.lessons.lessons6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        for (int i =0;i <10;i++){                 // Цикл от 0 до 10
//            System.out.println("Hello World");
//        }
//        for (int i=10;i>-1;i--){                   // continue - прерывание итерации "исключение"
//            if (i==5){
//                continue;
//            }
//            if (i==2){
//                break;                             // break - обрывание цикла
//            }
//            System.out.println(i);

//        int iterator=10;                                // Интератор  - после цикла '-1' т.к. в цикле
//        int x =10;                                      // от 10 до 0.
//            for (;iterator>=0 && x<100 ;iterator--,x++){
//
//            System.out.println(iterator);
//        }
//        System.out.println(" После цикла ");
//        System.out.println(iterator);

//        int iterator=10;
//        for (;iterator>=0;){
//            System.out.println(iterator);
//            iterator--;
//        }
//        System.out.println(" После цикла ");
//        System.out.println(iterator);

//        int iterator=10;                                    // FOR - Без условий, вечный цикл
//        for (;;){
//            System.out.println(iterator);
//            iterator++;
//        }
//        System.out.println(" После цикла ");
//        System.out.println(iterator);

//        Scanner scanner = new Scanner(System.in);             // Предыдущее ДЗ
//        int player1 = 0;
//        System.out.println("Введите номер игрока");
//        for (;;){
//            if (scanner.hasNextInt()) {
//                player1 = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("WRONG DATA! PLEASE  TRY AGAIN");
//                scanner.nextLine();
//            }
//
//       }
//
//        System.out.println(" Your number player " + player1);

        // Выведение только четных с помощью FOR

//        for (int i = 0; i < 21; i=i+2) {
//            System.out.println(i);
//        }
//        // или
//        for (int i = 0; i < 21; i=++ ) {
//           if (i % 2==0)
//           {System.out.println(i);
//           }
//        }
//
//
//        // Выведение только нечетных с помощью FOR
//        for (int i = 1; i < 21; i=i+2) {
//            System.out.println(i);
//        }
//        // или
//        for (int i = 0; i < 21; i=++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }


        // Вывксти на экран первые 11 членов последовательности Фибоноччи
        // 0,1,1,2,3,5,8,13,21,34,55.

//        int number1 = 0;
//        int number2 = 1;
//        int sum;                                                           // Любое значение
//        System.out.print(number1 + " " + number2 + " ");
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//            number1=number2;
//            number2=sum;
//
//        }

//        int i=0;                                                                 // While цикл
//        while (i<10){
//            i++;
//            System.out.println(" Hello World ");
//        }


//        int i = 10;
//        while (true) {
//            if (i == 9) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//


//        Scanner scanner = new Scanner(System.in);                                // While вечный цикл
//        int player1=0;
//        while (true) {
//            if (scanner.hasNextInt()) {
//                player1 = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("WRONG DATA! PLEASE  TRY AGAIN");
//                scanner.nextLine();
//            }
//        }

//        int i = 9;
//        while (i<10) {
//            i++;
//            if ((i == 7) || (i == 5)) {
//                continue;
//            }
//            if (i == 8) {
//                break;
//            }
//
//            System.out.println(i);


//        byte i = 10;                                          // Для тест заданий
//        while (true) {
//            if (i == 9) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }


//            Scanner scanner = new Scanner(System.in);              // do while Цикл
//       int player1;
//       do {
//            if (scanner.hasNextInt()) {
//                player1 = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data! please try again");
//                scanner.nextLine();
//            }
//        } while (true);

        // a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
        // b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win(разминирована)

        // a.
//        int timer=10;
//        while (timer>=0){
//            System.out.println(timer);
//            if(timer==0){
//                System.out.println("BOOOOOM!");
//
//            }
//            timer--;

//        // a+b.
//        Math.random();              // генерирует от 0.0 - до 0.99999 если нужно число > от 1 до 100 то->
//        int timer = 10;             // 0.99999 * 101 = 100.9999 -> каст до int = 100
//        while (timer >= 0) {
//            if ((int) (Math.random() * 101) >= 85) {
//                System.out.println(" DEFUSE - Разминирована! ");
//                break;
//            }
//            System.out.println(timer);
//            if (timer == 0) {
//                System.out.println(" BOOOOOM!");
//
//            }
//            timer--;
//        }

        //        Обчислити факторіал числа від 0 до N(10) (вводимо з консолі)
        //        Факториал 3  -  3!=1*2*3
        //        Факториал 5  -  5!=1*2*3*4*5

//        Scanner scanner = new Scanner(System.in);
//        int N = -1;
//        while (true) {
//            if (scanner.hasNextInt()) {
//                N = scanner.nextInt();
//                if (N < 0 || N > 10) {
//                    System.out.println("Please enter number from 0 to 10");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Wrong data! Try again");
//                scanner.nextLine();
//            }
//        }
//
//        int result = 1;
//        for (int i = 1; i <= N; i++) {
//            result *= i;
//        }
//
//        System.out.println(result);

//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.


//               int counter = 0;
//       for (int i = 1; i <11; i++) {
//            if ((i == 4) || (i == 9)) {
//                continue;
//            }
//            System.out.println("shuttle number:" + i);
//            counter++;
//        }
//
//        System.out.println("count = " + counter);
//    }
//}

//        int counter = 0;
//        for (int i = 1; i < 101; i++) {
//            if ((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9)) {
//                continue;
//            }
//            System.out.println("shuttle number:" + i);
//            counter++;
//        }
//
//        System.out.println("count = " + counter);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Введите количесво шатлов : ");
//        int s = 0;
//        while (true) {
//            if (scanner.hasNextInt()) {
//                s = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("WRONG DATA! PLEASE  TRY AGAIN");
//                scanner.nextLine();
//            }

        int counter = 0;
        for (int i = 1; ; i++) {
            if ((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9) ||
                    ((i / 10)%10 == 4) || ((i / 10)%10 == 9) || (i / 100 == 4) || (i % 100 == 9))
            {
                continue;
            }
            System.out.println("shuttle number:" + i);
            counter++;
            if (counter==100){
                break;
            }
        }

        System.out.println("Пронумеровано : " + counter + " шатлов ");
    }
}






