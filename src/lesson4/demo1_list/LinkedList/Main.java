package lesson4.demo1_list.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        users.add(new User(1,"wfsffse1"));
        users.add(new User(2,"wfsffse2"));
        users.add(new User(3,"wfsffse3"));
        users.add(new User(4,"wfsffse4"));

        System.out.println(users.element());
    }
}
