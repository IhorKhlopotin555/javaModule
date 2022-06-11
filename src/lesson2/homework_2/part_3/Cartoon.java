package lesson2.homework_2.part_3;

import lombok.*;


public class Cartoon extends Book{
    private String name;

    public Cartoon() {
    }

    public Cartoon(String name) {
        this.name = name;
    }

    public Cartoon(String type, String name) {
        super(type);
        this.name = name;
    }

    public Cartoon(String material, String type, String name) {
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
        return "Cartoon{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
