package lesson4.homework_4.part3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skills> skills = new ArrayList<>();
        skills.add(new Skills("java", 20));
        skills.add(new Skills("js", 10));
        skills.add(new Skills("c++", 10));

    Car car = new Car("toyota", 2021, 250);

        LinkedHashSet<User> users = new LinkedHashSet<User>();
        users.add(new User(2, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car));
        users.add(new User(3, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car));
        users.add(new User(4, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car));
        users.add(new User(5, "olya", "pupkina", "asd@asd.com", 31, Gender.FEMALE, skills, car));
        users.add(new User(6, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car));
        users.add(new User(1, "olya", "pupkina", "asd@asd.com", 31, Gender.FEMALE, skills, car));
        users.add(new User(7, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car));
        users.add(new User(8, "olya", "pupkina", "asd@asd.com", 31, Gender.FEMALE, skills, car));
        users.add(new User(9, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car));
        users.add(new User(10, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills, car));

        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User next = iterator.next();
            if (next.getGender().equals(Gender.MALE)) {
                iterator.remove();
            }
        }
                System.out.println(users);
    }
}
