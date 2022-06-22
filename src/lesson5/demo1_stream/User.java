package lesson5.demo1_stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int id;
    private String name;
    private boolean status;

    private List<String> skills = new ArrayList<String>();

    public User(int id, String name, boolean status){
        this.id = id;
        this.name = name;
        this.status = status;
    }
}
