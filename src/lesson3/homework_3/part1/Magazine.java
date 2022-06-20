package lesson3.homework_3.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine implements Printable {
    private String title;
    private Genre genre;

    public void print() {

        System.out.println("info about" + this.getClass().getSimpleName() + ": " + toString());
    }

}
