package lesson2.demo5_static;

public class User {
    static int counter = 0;
    static final double constt = 3.14; // не зміниться в подальшому
    private String name;

    public User(String name) {
        this.name = name;
        counter = counter + 1;
    }
}
