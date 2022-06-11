package lesson2.demo3_extends;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        SuperUser superUser = new SuperUser(1, "fdfdf", "login", "pass");
//        System.out.println(superUser);
//        superUser.greeting();

//        User user = new SuperUser();
//        User superUserbase = new User();
//        SuperUser superUser = (SuperUser) superUserbase;

        ArrayList<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new SuperUser(1, "fsfs", "fsdfsf", "dqq"));
        SuperUser user = (SuperUser) users.get(1);//хардкаст
        System.out.println(user);
    }
}
