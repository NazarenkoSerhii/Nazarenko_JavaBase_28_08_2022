package com.hillel.nazarenko.lessons.lessons15;

/*
        створіть клас Exam, у ньому попросіть користувача ввести тип
        транспортного засобу:
        MOTORCYCLE, CAR, BUS, TRUCK
        b. залежно від вибраного виду, виведіть літеру категорії прав, яка
        необхідна для керування цим транспортним засобом.
        приклад: MOTO = A, CAR = B
        c. виведіть у консоль букву категорії:
        "Для керування CAR необхідна категорія В"
        d. для кожної категорії створіть метод, який приймає на вхід
        кількість років досвіду водіння (вводимо з консолі), в якому рахуйте
        чи достатньо в людини досвіду щоб водити це транспортне
        засіб. З такими параметрами:
        А: від 3 років досвіду водіння
        В: від 0 років досвіду
        C: від 5 років досвіду
        D: від 7 років досвіду
        e. викликайте відповідний метод у switch
        f. введіть з консолі типу т.с. і років досвіду в циклі, щоб можна було
        перевіряти та видавати багато прав. цикл повинен працювати поки користувач
        не введе "no"
        g. створіть клас DriverLicense і якщо користувач може отримати права -
        створюйте йому екземпляр прав
        h. рахуйте кількість виданих прав і виведіть на екран після того як
        введено команду "no":
        Всього видано: 12 ліцензій
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        runApp();

        System.out.println("count license: " + DriverLicense.counter);

    }


    static void runApp() {
        Scanner scanner = new Scanner(System.in);
        TransportType[] transportTypes = TransportType.values();
        TransportType transportType = null;

        System.out.println("Please enter transport type from list: " + Arrays.toString(transportTypes));


        while (true) {
            String userValue = scanner.nextLine().toUpperCase();
//            String userValue = scanner.nextLine();
            for (TransportType type : transportTypes) {
                if (userValue.equals(type.toString())) {
                    transportType = TransportType.valueOf(userValue);
                    break;
                }
            }

            if (transportType != null) {
                break;
            } else {
                System.out.println("Wrong data");
            }
        }
        int years = -1;
        while (true) {
            System.out.println("Please enter drive experience");
            if (scanner.hasNextInt()) {
                years = scanner.nextInt();
                scanner.nextLine();
                if (years >= 0) {
                    break;
                } else {
                    System.out.println("Please positive number");
                }
            } else {
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }

        boolean ok = false;

        String str = "Для керування %s необхідна категорія %s";
        switch (transportType) {
            case MOTORCYCLE: {
                System.out.printf(str, TransportType.MOTORCYCLE.getTitle(), TransportCategory.A);
                ok = checkYears(years, TransportCategory.A);
                break;
            }
            case CAR: {
                System.out.println(String.format(str, TransportType.CAR.getTitle(), TransportCategory.B));
                ok = checkYears(years, TransportCategory.B);
                break;
            }
            case TRUCk: {
                System.out.println(String.format(str, TransportType.TRUCk.getTitle(), TransportCategory.C));
                ok = checkYears(years, TransportCategory.C);
                break;
            }
            case BUS: {
//                System.out.println("Для керування " +TransportType.BUS + " необхідна категорія " + TransportCategory.D);
                System.out.println(String.format(str, TransportType.BUS.getTitle(), TransportCategory.D));
                ok = checkYears(years, TransportCategory.D);
                break;
            }
        }

        if (ok) {
            new DriverLicense();
            System.out.println("Take your driver license");
        } else {
            System.out.println("You need more drive experience");
        }
    }

    private static boolean checkYears(int years, TransportCategory transportCategory) {

        switch (transportCategory) {
            case A : {
                return years > 3;                                 // if else - сокращенный
            }
            case B : {
                return (years > 0);
            }
            case C : {
                return years > 5;
            }
            case D : {
                return years > 7;
            }
            default: {
                return false;
            }
        }
    }




}