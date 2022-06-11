package lesson2.homework_2.part_2;

public class Laptop extends PC {
    private String model;
    private String country;


    public Laptop(int id, String name, String model, String country) {
        super(id, name);
        this.model = model;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                "} " + super.toString();
    }
}
