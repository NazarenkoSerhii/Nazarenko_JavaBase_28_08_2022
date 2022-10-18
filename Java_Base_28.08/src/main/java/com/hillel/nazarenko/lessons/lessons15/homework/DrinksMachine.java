package com.hillel.nazarenko.lessons.lessons15.homework;

public enum DrinksMachine {
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    MINERALWATER("Минеральная вода"),
    COCACOLA("Кока-кола");

    public String drinkName;

    public String getDrinkName() {
        return drinkName;
    }
    DrinksMachine(String drinkName) {
        this.drinkName = drinkName;
    }

}

