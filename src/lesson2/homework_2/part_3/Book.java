package lesson2.homework_2.part_3;

import lombok.*;


public class Book extends Material{
    private String type;

    public Book() {
    }

    public Book(String type) {
        this.type = type;
    }

    public Book(String material, String type) {
        super(material);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
