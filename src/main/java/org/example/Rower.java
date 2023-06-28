package org.example;

public class Rower extends Pojazd{
    String rodzaj;

    public Rower(int koła, String kolor, String sound, String rodzaj) {
        super(koła, kolor, sound);
        this.rodzaj = rodzaj;
    }

    @Override
    protected void informacje() {
        super.informacje();
        System.out.println("rodzaj roweru: "+this.rodzaj);
    }
}
