package lesson4.homework_4.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int id;
    private int age;
    private String name;
}
