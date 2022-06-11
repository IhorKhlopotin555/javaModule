package lesson2.homework_2.part_4;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String age;
    private String gender;
    private Skills skills_1;
    private Skills skills_2;
    private Skills skills_3;
    private Car car;

    @Override
    public String toString() {
        return "User: " + name + " {" +
                "id:" + id +
                ", name:" + name +
                ", surname:" + surname +
                ", email:" + email +
                ", age:" + age +
                ", gender:" + gender +
                ", skills:" + "[" + skills_1 + skills_2 + skills_3 + "], " +
                "car:" + car + "}}";
    }
}
