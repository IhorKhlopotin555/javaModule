package lesson2.homework_2.part_2;

public class Ultrabook extends Laptop{
    private String videocard;
    private String fullscreen;

    public Ultrabook(int id, String name, String model, String country, String videocard, String fullscreen) {
        super(id, name, model, country);
        this.videocard = videocard;
        this.fullscreen = fullscreen;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(String fullscreen) {
        this.fullscreen = fullscreen;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "videocard='" + videocard + '\'' +
                ", fullscreen='" + fullscreen + '\'' +
                "} " + super.toString();
    }
    public void choose_ult(){
        System.out.println("Choose your Ultrabook");
    }
}
