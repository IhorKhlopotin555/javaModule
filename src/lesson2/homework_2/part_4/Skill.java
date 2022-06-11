package lesson2.homework_2.part_4;

public enum Skill {
    FRONTEND("JS"), BACKEND("Java"), DEVOPS("C++");

    private String token;

    @Override
    public String toString() {
        return token + "(" + super.toString() + ")";
    }

    Skill(String token) {
        this.token = token;
    }
}
