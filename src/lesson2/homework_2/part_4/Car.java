package lesson2.homework_2.part_4;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Car {
    private String model;
    private String series;
    private String year;
    private String power;

    @Override
    public String toString() {
        return "{" + "model:" + model +
                ", series:" + series +
                ", year:" + year +
                ", power:" + power;
    }
}
