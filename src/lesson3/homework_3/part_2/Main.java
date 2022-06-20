package lesson3.homework_3.part_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Trumpet(12.5));
        instruments.add(new Drums(20));
        instruments.add(new Guitar(6));
        for (Instrument instrument : instruments) {
            System.out.println(instrument.play());
        }
    }
}
