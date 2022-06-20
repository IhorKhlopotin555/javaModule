package lesson4.homework_4.part2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vocabular> words = new ArrayList<>();
        words.add(new Vocabular(1, "Book"));
        words.add(new Vocabular(2, "Home"));
        words.add(new Vocabular(3, "Friends"));
        words.add(new Vocabular(4, "Java"));
        words.add(new Vocabular(5, "Octen"));
        words.add(new Vocabular(6, "Work"));
        words.add(new Vocabular(7, "Cloud"));
        words.add(new Vocabular(8, "Getter"));
        words.add(new Vocabular(9, "String"));
        words.add(new Vocabular(10, "Beach"));
        words.add(new Vocabular(11, "Brother"));
        words.add(new Vocabular(12, "Assessments"));
        words.add(new Vocabular(13, "Perish"));
        words.add(new Vocabular(14, "Require"));
        words.add(new Vocabular(15, "Simpsons"));

        //method 1
        Collections.sort(words, new WordComparator());
        for (Vocabular vocabular : words) {
            System.out.println(vocabular.id + " " + vocabular.word);
        }
        //method 2
        words.sort((o1, o2) -> o1.getWord().compareTo(o2.getWord()));
        System.out.println("Sorted by alphabet: " + words);
    }
}
