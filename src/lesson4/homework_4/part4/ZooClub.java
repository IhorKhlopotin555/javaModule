package lesson4.homework_4.part4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ZooClub {
    private Map<Person, List<Pet>> club;
}
