package lesson2.demo1_composition;



public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("sfsf","08798798t");
        User user = new User(1, "vasya", passport);
        //Customer customer = new Customer("asfsf", "fasfsa", passport);
        Customer customer = new Customer(//агрегація
                "asfsf",
                "fasfsa",
                "fsafasfa",
                "076378t"
        );
    }
}
