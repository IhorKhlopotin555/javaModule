package lesson5.homework_5.part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(5);
        arrList.add(21);
        arrList.add(33);
        arrList.add(12);
        arrList.add(22);
        arrList.add(10);
        arrList.add(30);
        arrList.add(1);
        arrList.add(2);
        arrList.add(4);

//    List<Integer> streamer = arrList.stream()
//            .sorted((o1, o2) -> o1 - o2)
//            .collect(Collectors.toList());
//        System.out.println("Sorted: " + streamer);
//
//    List<Integer> streamer2 = arrList.stream()
//            .filter(number -> 0 == number % 3)
//            .collect(Collectors.toList());
//        System.out.println("Filtred by %3: " + streamer2);
//    List<Integer> streamer3 = arrList.stream()
//            .filter(number -> 0 == number % 10)
//            .collect(Collectors.toList());
//    System.out.println("Filtred by %10: " + streamer3);

        arrList.stream()
            .map(i -> i * 3)
            .forEach(System.out::println);

    }
}
