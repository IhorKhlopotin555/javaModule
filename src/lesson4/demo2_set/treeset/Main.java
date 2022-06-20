package lesson4.demo2_set.treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Set => sorted set and Unique
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1,"wfsffse1"));
        users.add(new User(2,"wfsffse2"));
        users.add(new User(3,"wfsffse3"));
        users.add(new User(4,"wfsffse4"));
        System.out.println(users);
    }
}
