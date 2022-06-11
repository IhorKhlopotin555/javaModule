package lesson2.homework_2.part_3;

import lombok.*;


public class Magazine extends Book{
    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine(String type, String name) {
        super(type);
        this.name = name;
    }

    public Magazine(String material, String type, String name) {
        super(material, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
