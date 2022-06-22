package lesson5.demo1_stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Mykola", true));
        users.add(new User(2, "Galya", false));
        users.add(new User(2, "Galya", false));
        users.add(new User(2, "Galya", false));
        users.add(new User(3, "Severyn", true));
        users.add(new User(4, "Dmytro", true));
        users.add(new User(4, "Dmytro", true));

//        Stream<User> userStream = users.stream();
//
//        List<User> collect = userStream
//                .distinct()// прибирає дубляжі
//                .filter(user -> user.isStatus())
//                .collect(Collectors.toList());
//                //.forEach(user -> System.out.println(user));
//        System.out.println(collect);

//        List<SimpleUser> collect = users.stream()
//                .map(user -> new SimpleUser(user.getId(), user.getName()))
//                .collect(Collectors.toList());
//        System.out.println(collect);

        //Stream.of(users);

//        boolean b = users.stream()
//                .allMatch(user -> user.getId() > 0);
//        users.stream().anyMatch(user -> user.isStatus());

//        Optional<User> first = users.stream().findFirst();
//        User x = first.orElse(new User());
//        System.out.println(first.get());

//        users.stream()
//                .distinct()
//                .limit(3);

//        Stream<String> stringStream = users.stream().flatMap(user -> user.getSkills().stream);
//        stringStream.forEach(System.out::println);

        //Optional<User> max = users.stream().max((o1, o2) -> o1.getId() - o2.getId());

//
//        List<User> collect = users.stream()
//                .sorted((o1, o2) -> o1.getId() - o2.getId())
//                .filter(user -> user.getId() > 2)
//                .collect(Collectors.toList());

//        users.stream()
//                .reduce(new User(), new BinaryOperator<User>() {
//                    @Override
//                    public User apply(User user, User user2) {
//                        return null;
//                    }
//                });
//        List<String> letters = Arrays.asList("h", "e", "s","o", "y", "a", "m");
//        String reduce = letters.stream()
//                .reduce("", (accumulator, element) -> accumulator + element);
//        System.out.println(reduce);

//        User reduce = users.stream().reduce(new User(), (identify, user) -> {
//
//            identify.getSkills().addAll(user.getSkills());
//            return identify;
//        });

        //users.stream().skip(2);

    }
}
