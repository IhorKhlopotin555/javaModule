package lesson2.demo4_abstract;

public abstract class Animal {
    private boolean isBrain;
    private boolean tail;

    public Animal() {
    }

    public Animal(boolean isBrain) {
        this.isBrain = isBrain;
    }

    public boolean isBrain() {
        return isBrain;
    }

    public void setBrain(boolean brain) {
        isBrain = brain;
    }
    public abstract void signalize();
}
