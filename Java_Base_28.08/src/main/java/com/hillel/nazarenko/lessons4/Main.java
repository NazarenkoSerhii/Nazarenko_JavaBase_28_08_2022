package com.hillel.nazarenko.lessons4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//
//       int a = 10;
//        int b = 3;

//        System.out.println(a / b);
 //       System.out.println((double) a / b);

//        System.out.println((double) 10 / 3);
 //       System.out.println(10.0 / 3);
//        System.out.println(10d / 3);


//        System.out.println(10 % 2); // 0           // Остаток от деления
//        System.out.println(10 % 3); // 1
//        System.out.println(10 % 4); // 2
//        System.out.println(10 % 5); // 0
//        System.out.println(10 % 6); // 4
//        System.out.println(10 % 7); // 3

//       a=a+10;
//       a+=10;
//       a-=5;
//       a/=2;
//       a*=2;
//       a+= 2*5-5;

//        a = a + 1;
//        a += 1;

//        a++;
//        ++a;

//        System.out.println(a);
//        System.out.println(a--);
//        System.out.println(a);

        // a=10
        // b=3
//        System.out.println(a++ + --b);           // инкремент и декремент

//        System.out.println(a++ + --b + --a + ++b);
//        System.out.println(a++ + ++b + a++ - --b);
//        System.out.println(a++ + a + ++b + a++ - b++ + ++a + ++b );
//        System.out.println(a++ + a++ + ++b + ++a - b++ + a + ++b + a++ + a +b );
//        System.out.println(a++ + a-- + b++ + ++a - b++ + --a + a++ + --b + a++ + a +b );

//        System.out.println(Math.pow(5, 3));     // Возведение в степень
//        System.out.println(Math.pow(4, 4));
//
//        System.out.println(Math.sqrt(16));      // Квадратный корень
//        System.out.println(Math.sqrt(25));
//
//        System.out.println( 10 + Math.PI);     // Пи - 3.14
//        System.out.println( 10 + Math.E);
//
//        System.out.println(Math.round(10.5));        // Округление
//        System.out.println(Math.round(10.2));
//        System.out.println(Math.round(10.8));

//        System.out.println(Math.abs(-10));             // Число по модулю
//        System.out.println(Math.abs(10));

        // range with 0 to 0.999999
//        System.out.println(Math.random());               // Рандом от 0 до 0.99999999
       // 0.0 * 21 = 0.0 int 0
       // 0.99999 * 21 = 21.99999   int 20
//        System.out.println((int) (Math.random()*21));
//        System.out.println((int) (Math.random()*21));
//        System.out.println((int) (Math.random()*21));
//        System.out.println((int) (Math.random()*21));
//        System.out.println((int) (Math.random()*21));
//        System.out.println((int) (Math.random()*21));
//        System.out.println((int) (Math.random()*21));

        // from 15 to 40
//        int min=15;
//        int max=40;
//        System.out.println(min + (int) (Math.random()*(max-min+1)));    //Рандом от 15 до 40
//        System.out.println(min + (int) (Math.random()*(max-min+1)));
//        System.out.println(min + (int) (Math.random()*(max-min+1)));
//        System.out.println(min + (int) (Math.random()*(max-min+1)));
//        System.out.println(min + (int) (Math.random()*(max-min+1)));

        int a = 10;
        int b =5;
        int c=3;
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a>=b);

//        boolean result= a>b || c>b;           // Логическая операция  "or" - ||
//        System.out.println(result);

//        boolean result= a>b && c>b;            //  Логическая операция  "and" - &&
//        System.out.println(result);

//        System.out.println(a > b && ++c < 5);    // and true
//        System.out.println(c);

//        System.out.println(a < b && ++c < 5);        // and false
//        System.out.println(c);

//        System.out.println(a > b && c > b || b < a && 10 > 11);


        //        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
//        Розрахувати:
//        1. для кожного працівника суму зарплати за 10 років
//        2. відняти 5% податок
//        3. порахувати середнє арифметичне за трьома сумами за 10 років
//        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
//        середнє арифм.


//        int a = 700;
//        int b = 2000;
//        int c = 3500;

//        int countMonth10Years = 10 * 12; // 120
//
//
//        int salary1 = a * countMonth10Years;
//        int salary2 = b * countMonth10Years;
//        int salary3 = c * countMonth10Years;
//
//        System.out.println(salary1);
//        System.out.println(salary2);
//        System.out.println(salary3);
//
//        double salary1WithoutTax = salary1 - salary1 * 0.05;
//        double salary2WithoutTax = salary2 - salary2 * 0.05;
//        double salary3WithoutTax = salary3 - salary3 * 0.05;
//
//        System.out.println();
//        System.out.println(salary1WithoutTax);
//        System.out.println(salary2WithoutTax);
//        System.out.println(salary3WithoutTax);
//
//        System.out.println();
//        System.out.println(salary1WithoutTax + salary2WithoutTax + salary3WithoutTax / 3 );
//        System.out.println();
//        System.out.println(salary1WithoutTax + salary2WithoutTax + salary3WithoutTax);


        a = 2;
        b = -3;
        c = 16;
        //        a. | a - b | / ( a + b ) * 3 - √c

//        double value = Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c);
//        System.out.println(value);
//

//        b. ( a + b ) / 12 * c % 4 + |b|

        // 1.66666666667

        double result = (double) (a + b) / 12 * c % 4 + Math.abs(b);
        System.out.println(result);


        System.out.println((double) (a + b));
        System.out.println((double) (a + b) / 12);
        System.out.println((double) (a + b) / 12 * c % 4);
        System.out.println((double) (a + b) / 12 * c % 4 + Math.abs(b));

        System.out.println();

        final double COEF = 1.5;













    }
}