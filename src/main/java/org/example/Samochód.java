package org.example;

public class Samochód extends Pojazd{
    String silnik;

    public Samochód(int koła, String kolor, String sound, String silnik) {
        super(koła, kolor, sound);
        this.silnik = silnik;
    }

    @Override
    protected void informacje() {
        super.informacje();
        System.out.println("silnik samochodu:"+this.silnik);
    }
}
