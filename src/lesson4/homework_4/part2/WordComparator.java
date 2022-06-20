package lesson4.homework_4.part2;

import java.util.Comparator;

class WordComparator implements Comparator<Vocabular> {

    public int compare(Vocabular w1, Vocabular w2)
    {
        return w1.word.compareTo(w2.word);
    }
}