package lesson3.homework_3.part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("starwars", 700, 1000));
        printables.add(new Magazine("WWE", Genre.ANIME));
        for (Printable printable : printables){
            printable.print();
        }
    }
}
