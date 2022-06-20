package lesson4.demo3_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//      HashMap<Integer, String> map = new HashMap();
//      LinkedHashMap<Integer, String> map = new LinkedHashMap();
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
//        System.out.println(map.get(1));
//        System.out.println(map.containsKey(1));
//        System.out.println(map.keySet());//set of keys
//        System.out.println(map.values());// all values
//        System.out.println(map.replace(1,"uno"));

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next);
            if (next.getValue().equals("two")) {
                iterator.remove();
            }
        }
    }
}
