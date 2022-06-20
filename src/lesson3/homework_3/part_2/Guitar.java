package lesson3.homework_3.part_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument{
    private int strings;

    @Override
    public String play(){
        return "instrument " + this.getClass().getSimpleName() + "plays with" + this.toString();
    }

    }


