package com.hillel.nazarenko.lessons.lessons13.Main.homework13;

public abstract class MusicStyles {

    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    abstract void playMusic();
}