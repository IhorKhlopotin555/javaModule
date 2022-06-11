package lesson2.homework_2.part_1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class User {
    private int id;
    private String name;
    private String username;
    private String gmail;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
