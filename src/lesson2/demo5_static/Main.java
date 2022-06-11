package lesson2.demo5_static;

public class Main {
    public static void main(String[] args) {
//        System.out.println(User.counter);
//        User user1 = new User();
//        user1.counter = 200;
//        System.out.println(user1.counter); //200
//
//        User user2 = new User();
//        System.out.println(user2.counter); //200

        System.out.println(User.counter);
        User joo = new User("joo");
        System.out.println(User.counter);
        User moo = new User("moo");
        System.out.println(User.counter);
    }
}
