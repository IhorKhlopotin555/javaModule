package lesson2.homework_2.part_4;

public class Main {
    public static void main(String[] args) {

        Car car_vasya = new Car("Daewoo", "Lanos", "2007", "75hp");

        Skills skill_1 = new Skills(Skill.DEVOPS, "30");
        Skills skill_2 = new Skills(Skill.BACKEND, "20");
        Skills skill_3 = new Skills(Skill.FRONTEND, "40");

        User vasya = new User(1, "Vasya", "Pupkin", "asd@asd.com", "31", "male", skill_1, skill_2, skill_3, car_vasya);
        System.out.println(vasya);

    }
}

