package com.hillel.nazarenko.lessons.lessons12.homework;

public class Main {
    public static void main(String[] args) {

        User user = new User("Den", 22, 03, 2000,
                "Den2000@icloud", "+380950000000", "Denov", 90, "125/90",
                8000, 0);
        user.printAccountInfo();
        user.setSurName("Denovenko");
        user.setPedometer(11000);
        user.setWeight(85);
        user.setArterialPressure("120/80");
        user.printAccountInfo();
        System.out.println();

        User user1 = new User("Kristi", 15, 05, 2001,
                "Kristi01@icloud.com", "+30970000000", "Kristenko", 75, "120/85",
                9000, 0);
        user1.printAccountInfo();
        user1.setSurName("Kristenyuk");
        user1.setPedometer(12000);
        user1.setWeight(70);
        user1.setArterialPressure("120/80");
        user1.printAccountInfo();
        System.out.println();

        User user2 = new User("Jackie", 7, 04, 1954, "Chan54@gmail.com", "000000",
                "Chan", 75, "120/80", 8000, 0);
        user2.printAccountInfo();
        System.out.println();

        User user3 = new User("Kate", 8, 07, 1973, "Kate73@gmail.com", "000000",
                "Beckinsale", 70, "120/80", 10000, 0);
        user3.printAccountInfo();
        System.out.println();

        User user4 = new User("Sigourney", 8, 10, 1949, "Sig49@gmail.com", "000000",
                "Weaver", 75, "120/80", 70000, 0);
        user4.printAccountInfo();

    }

}




