package lesson2.homework_2.part_4;

import lombok.*;

import java.util.ArrayList;

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
    private ArrayList<Skills> skills;
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
                ", skills:" + skills + "," +
                "car:" + car + "}}";
    }
}
