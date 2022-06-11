package lesson2.homework_2.part_2;

public class Workstation extends Laptop {
    private String CPU;
    private String cache_size;

    public Workstation(int id, String name, String model, String country, String CPU, String cache_size) {
        super(id, name, model, country);
        this.CPU = CPU;
        this.cache_size = cache_size;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getCache_size() {
        return cache_size;
    }

    public void setCache_size(String cache_size) {
        this.cache_size = cache_size;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "CPU='" + CPU + '\'' +
                ", cache_size='" + cache_size + '\'' +
                "} " + super.toString();
    }
    public void choose_wst(){
        System.out.println("Choose your Workstation");
    }
}
