package com.hillel.nazarenko.lessons.lessons15;

public class Main {

    public static void main(String[] args) {


//        System.out.println(TransportTypeClass.MOTORCYCLE.getTitle());


//        System.out.println(TransportType.MOTORCYCLE.getTitle());
//
//
        for (TransportType transportType : TransportType.values()) {             //values
            System.out.println(transportType);                                   // возврващает массив объектов
            System.out.println(transportType.getTitle());
        }

//        TransportType motorcycle = TransportType.MOTORCYCLE;          //value off
//                                                                      // возврващает из Enum объект по названию
//
//        switch (motorcycle) {
//            case CAR: {
//                System.out.println("its car");
//                break;
//            }
//
//            case BUS: {
//                System.out.println("its bus");
//                break;
//            }
//
//            case MOTORCYCLE: {
//                System.out.println("YES!!!!!!!!!!!!!!");
//                break;
//            }
//        }

    }


    static boolean getBoolean() {
        return (Math.random() * 10) > 5;
    }

    static void demo() {                                                 // try catch
        TransportType transportType = null;
        try {
            transportType = TransportType.valueOf("BUS");
        } catch (IllegalArgumentException e) {
            System.out.println("error");
        }

        if (transportType != null) {
            System.out.println(transportType.getTitle());
        }
    }

}