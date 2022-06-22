package lesson5.homework_5.part_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vocabular> words = new ArrayList<>();
        words.add(new Vocabular(1, "Book"));
        words.add(new Vocabular(2, "Home"));
        words.add(new Vocabular(3, "Box"));
        words.add(new Vocabular(4, "Java"));
        words.add(new Vocabular(5, "Octen"));
        words.add(new Vocabular(6, "Work"));
        words.add(new Vocabular(7, "Cloud"));
        words.add(new Vocabular(8, "Low"));
        words.add(new Vocabular(9, "String"));
        words.add(new Vocabular(10, "Beach"));
        words.add(new Vocabular(11, "Rot"));
        words.add(new Vocabular(12, "Assessments"));
        words.add(new Vocabular(13, "Cox"));
        words.add(new Vocabular(14, "Require"));
        words.add(new Vocabular(15, "Simpsons"));



//        List<Vocabular> sortedList = words.stream()
//                .filter(word -> word.getWord().length() < 4)
//                .collect(Collectors.toList());
//        System.out.println("Sorted by word length < 4"+sortedList);

//        List<Vocabular> sortedList = words.stream()
//                .sorted(Comparator.comparing(Vocabular::getWord))
//                .collect(Collectors.toList());
//        for (Vocabular vocabular : sortedList) System.out.println("Sorted by alphabeth: " + vocabular);

    }
}
