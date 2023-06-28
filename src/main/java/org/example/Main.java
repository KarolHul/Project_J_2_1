package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Samochód samochód = new Samochód(4,"Czarny","Beep","Diesel");
        Rower rower = new Rower(2,"Biały","Brak","Miejski");
        ArrayList<Pojazd> garaż = new ArrayList<Pojazd>();
        garaż.add(samochód);
        garaż.add(rower);
        for (Pojazd i:garaż) {
            i.informacje();
        }
    }
}