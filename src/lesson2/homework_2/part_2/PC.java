package lesson2.homework_2.part_2;

public class PC {
    private int id;
    private String name;

    public PC() {
    }

    public PC(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PC{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void choose() {
        System.out.println("Choose your PC");
    }


}

