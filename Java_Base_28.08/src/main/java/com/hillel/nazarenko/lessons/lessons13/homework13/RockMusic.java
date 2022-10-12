package com.hillel.nazarenko.lessons.lessons13.homework13;

public class RockMusic extends MusicStyle {
    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Rock music play " + name);
    }
}
