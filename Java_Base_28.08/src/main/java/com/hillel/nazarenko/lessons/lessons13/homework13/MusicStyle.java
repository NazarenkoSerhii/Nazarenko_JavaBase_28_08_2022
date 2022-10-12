package com.hillel.nazarenko.lessons.lessons13.homework13;

public abstract class MusicStyle {

    String name;

    public MusicStyle(String name) {
        this.name = name;
    }

    public abstract void playMusic();
}
