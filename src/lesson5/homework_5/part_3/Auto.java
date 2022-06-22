package lesson5.homework_5.part_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Auto {
    private String model;
    private int hp;
    private Owner owner;
    private String price;
    private int year;
}
