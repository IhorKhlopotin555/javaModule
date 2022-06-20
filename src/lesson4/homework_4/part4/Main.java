package lesson4.homework_4.part4;

import java.util.*;

//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//        Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

public class Main {
    public static void main(String[] args) {
        //Map<Person, List<Pet>> club
        Person ivan = new Person("Ivan");
        Person petro = new Person("Petro");
        Person vasyl = new Person("Vasyl");

        List<Pet> dogs = new ArrayList<>();
        dogs.add(new Pet("Chappi"));
        dogs.add(new Pet("Bobik"));

        List<Pet> cats = new ArrayList<>();
        cats.add(new Pet("Barsik"));
        cats.add(new Pet("Murka"));


        HashMap<Person, List<Pet>> map = new HashMap<>();
        map.put(ivan, dogs);
        map.put(petro, cats);
        //System.out.println(map);

        Set<Map.Entry<Person, List<Pet>>> club = map.entrySet();
        Iterator<Map.Entry<Person, List<Pet>>> iterator = club.iterator();
        while(iterator.hasNext()){
            Map.Entry<Person, List<Pet>> next = iterator.next();
            System.out.println(next);
            if(next.getKey().equals(0)){
                iterator.remove();
            }
        }
    }
}
