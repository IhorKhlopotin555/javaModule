package lesson3.homework_3.part_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Trumpet implements Instrument{
    private double diametr;
    @Override
    public String play() {
      return "instrument " + this.getClass().getSimpleName() + "plays with" + this.toString();
    }
}
