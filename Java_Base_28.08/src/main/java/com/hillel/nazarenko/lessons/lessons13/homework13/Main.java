package com.hillel.nazarenko.lessons.lessons13.homework13;

public class Main {
    public static void main(String[] args) {


        MusicStyle[] musicStyles = {new RockMusic("GodSmack"),
                new PopMusic("Beyoncé "),
                new ClassicMusic("Johann Sebastian Bach "),
        };
        for (MusicStyle musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}