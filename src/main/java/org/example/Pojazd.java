package org.example;

public class Pojazd {
    int koła;
    String kolor,sound;

    public Pojazd(int koła, String kolor, String sound) {
        this.koła = koła;
        this.kolor = kolor;
        this.sound = sound;
    }

    protected void informacje(){
        System.out.println("Ilość kół: " +this.koła+" kolor: "+this.kolor+" dźwięk: "+this.sound);
    }
}
