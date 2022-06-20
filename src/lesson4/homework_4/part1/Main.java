package lesson4.homework_4.part1;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        users.add(new User(1, 22, "Vasyaaa"));
        users.add(new User(2, 30, "Orest"));
        users.add(new User(3, 18, "Kolyaa"));
        users.add(new User(4, 44, "Anna"));

        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Sort by age increase: " + users);

        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println("Sort by age decrease: " + users);

        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println("Sort by name length increase: " + users);

        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println("Sort by name length decrease:" + users);

    }
}

