package lesson4.demo1_list.arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"wfsffse1"));
        users.add(new User(2,"wfsffse2"));
        users.add(new User(3,"wfsffse3"));
        users.add(new User(4,"wfsffse4"));

        users.remove(new User(2,"wfsffse2"));

        System.out.println(users);

        //users.sort((o1, o2) -> o1.getId()-o2.getId());
        users.sort(Comparator.comparingInt(User::getId));

        users.removeIf(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return user.getId() > 0;
            }
        });
        users.removeIf(user -> user.getId() > 0);

        users.addAll(null);//add collection instead null;
        users.removeAll(null);//remove collection instead null;
        users.forEach(user -> System.out.println(user));
        users.forEach(System.out::println);//same as upper text

        users.replaceAll(user -> {
            if(user.getName().equals("")){
                return new User (0, "fwfewf");
            }
            return user;
        });

        users.set(0,new User());//replace object

        User[] users1 = new User[10];
        Object[] objects = users.toArray(users1);

    }
}
