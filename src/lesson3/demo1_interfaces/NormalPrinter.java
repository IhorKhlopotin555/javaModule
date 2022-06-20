package lesson3.demo1_interfaces;

import java.util.ArrayList;

public class NormalPrinter implements ArrayPrinter, ArraySorter{
    public void print(ArrayList<String> strings) {
        for(String string : strings){
            System.out.println(string);
        }
    }

    @Override
    public void sort(ArrayList<String> strings) {
        System.out.println("ifjwifjo");
    }
}
