package lesson5.homework_5.part_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Owner vasya = new Owner("Vasya", 30, 7);
        Owner petro = new Owner("Petro", 22, 4);
        Owner igor = new Owner("Igor", 22, 2);
        Owner vova = new Owner("Vova", 29, 10);
        Owner anya = new Owner("Anya", 24, 1);
        Owner olya = new Owner("Olya", 21, 0);
        Owner dmytro = new Owner("dmytro", 23, 7);

        ArrayList<Auto> autoCard = new ArrayList<>();
        autoCard.add(new Auto("Daewoo", 80, vasya, "2000$", 2007));
        autoCard.add(new Auto("Audi", 150, petro, "4000$", 2008));
        autoCard.add(new Auto("Subaru", 280, igor, "5000$", 2004));
        autoCard.add(new Auto("Huindai", 100, vova, "1500$", 2000));
        autoCard.add(new Auto("Mitsubishi", 230, anya, "8000$", 2010));
        autoCard.add(new Auto("Skoda", 230, olya, "6000$", 2009));
        autoCard.add(new Auto("Honda", 250, dmytro, "12000$", 1999));

//        autoCard.stream()
//                .map(i -> i.getHp() * 1.1)
//                .forEach(System.out::println);





    }
}
