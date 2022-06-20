package lesson4.demo2_set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<User> users = new LinkedHashSet<User>();
        users.add(new User(1,"wjoifwejf1"));
        users.add(new User(2,"wjoifwejf2"));
        users.add(new User(3,"wjoifwejf3"));
        users.add(new User(4,"wjoifwejf4"));
        System.out.println(users);

//        for (User user : users) {
//            users.remove(user);
//        }

        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User next = iterator.next();
            if(next.getId() == 2){

            }
        }
        System.out.println(users);
    }
}
