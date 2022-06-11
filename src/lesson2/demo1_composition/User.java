package lesson2.demo1_composition;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class User {
    private int id;
    private String name;

    private Passport passport;
}
