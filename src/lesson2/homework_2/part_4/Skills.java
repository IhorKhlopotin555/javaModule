package lesson2.homework_2.part_4;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Skills {
    private Skill skill;
    private String exp;



    @Override
    public String toString() {
        return "{" + "specialisation:" + skill +
                ", exp:" + exp + "}";
    }

    }

