package lesson2.homework_2.part_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {


        Car car_vasya = new Car("Daewoo", "Lanos", "2007", "75hp");

        Skills skill_1 = new Skills(Skill.DEVOPS, "30");
        Skills skill_2 = new Skills(Skill.BACKEND, "20");
        Skills skill_3 = new Skills(Skill.FRONTEND, "40");

            ArrayList<Skills> skills = new ArrayList<>();
            skills.add(skill_1);
            skills.add(skill_2);
            skills.add(skill_3);
            for (int i = 0; i < skills.size(); i++) {
                System.out.println(skills.get(i));
            }


        User vasya = new User(1, "Vasya", "Pupkin", "asd@asd.com", "31", "male",skills, car_vasya);
        System.out.println(vasya);

    }
}

