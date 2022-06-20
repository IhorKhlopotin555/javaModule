package lesson4.demo2_set.hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //non sorted (hash based order) unique collection
        //hash objects
        HashSet<User> users = new HashSet<User>();
        users.add(new User(1,"fewfewf"));
        users.add(new User(2,"fewfewf"));
        users.add(new User(2,"fewfewf"));
        users.add(new User(2,"fewfewf"));
        users.add(new User(3,"fewfewf"));
        users.add(new User(3,"fewfewf"));
        users.add(new User(3,"fewfewf"));
        users.add(new User(4,"fewfewf"));
        System.out.println(users);// об'єкт перетворюється на число для уникненя колізії
    }

}
