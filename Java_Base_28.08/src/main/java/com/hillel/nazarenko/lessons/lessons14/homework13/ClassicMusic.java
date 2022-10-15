package com.hillel.nazarenko.lessons.lessons14.homework13;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("playing classic music");
    }
}