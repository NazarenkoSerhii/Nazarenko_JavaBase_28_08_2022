package com.hillel.nazarenko.lessons.lessons10.homework;

public class Person {
    public static void main(String[] args) {

        String w = "Will", s = "Smith", n = "New York", p = "+12125555555";
        String persona1 = personInfo(w, s, n, p);
        System.out.println(persona1);

        String j = "Jackie", c = "Chan", sh = "Shanghai", ph = "+214444444";
        String persona2 = personInfo(j, c, sh, ph);
        System.out.println(persona2);

        String sher = "Sherlock", h = "Holmes", l = "London", pn = "+020777777";
        String persona3 = personInfo(sher, h, l, pn);
        System.out.println(persona3);


    }

    static String personInfo(String n, String s, String c, String ph) {
        String persona = "Позвонить гражданину " + n + " " + s + " из города " + c + " можно по номеру " + ph;
        return persona;
    }
}
