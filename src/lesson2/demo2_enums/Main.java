package lesson2.demo2_enums;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "jfiji", Role.MANAGER);

//        Extractor extractor = new Extractor();
//        extractor.extractToken(user);
//        System.out.println(extractor);

    Role[] values = Role.values();
    for (Role value : values){
        System.out.println(value + " " + value.ordinal());
    }
        System.out.println(user);
    }
}
