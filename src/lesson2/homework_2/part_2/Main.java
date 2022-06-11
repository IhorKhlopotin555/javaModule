package lesson2.homework_2.part_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PC> ub = new ArrayList<>();
        ub.add(new PC(1, "Ultrabooks"));
        ub.add(new Ultrabook(1, "Lenovo", "IdeaPad", "China", "Radeon", "2k"));
        ub.add(new Ultrabook(2, "Sony", "Vaio", "Korea", "Geforce", "4k"));
        // Ultrabook ubu = (Ultrabook) ub.get(1);
        //ubu.choose_ult();
        System.out.println(ub);

        ArrayList<PC> ws = new ArrayList<>();
        ws.add(new PC(2, "Workstations"));
        ws.add(new Workstation(1, "Toshiba", "Satellite", "Japan", "Intel Core 2 duo", "32mb"));
        ws.add(new Workstation(2, "IBM", "ThinkPad", "USA", "Intel Core I5", "16Mb"));
        //Workstation wst = (Workstation) ws.get(1);
        //wst.choose_wst();
        System.out.println(ws);
    }

}
