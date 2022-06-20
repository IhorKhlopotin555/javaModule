package lesson3.demo1_interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("sdads1");
        strings.add("sdads2");
        strings.add("sdads3");
        strings.add("sdads4");

        NormalPrinter normalPrinter = new NormalPrinter();
        printArray(strings, normalPrinter);
        printArray(strings, new ReversePrinter());

        ArraySorter arraySorter = new NormalPrinter();
        arraySorter.sort(null);
        ArrayPrinter arrayPrinter = new NormalPrinter();
        arrayPrinter.print(null);

    }

    public static void printArray(ArrayList<String> strings, ArrayPrinter arrayPrinter) {
        arrayPrinter.print(strings);
    }
public void sortArray(ArrayList<String> strings, ArraySorter arraySorter) {
        arraySorter.sort(strings);
    }
}


