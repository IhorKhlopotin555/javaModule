package lesson2.demo6_classVariations;

public class Main {
    public static void main(String[] args) {

    InnerClassWrapper.InnerClass innerClass = new InnerClassWrapper().new InnerClass();

    InnerStaticClassWrapper.InnerStatic innerStatic = new InnerStaticClassWrapper.InnerStatic();

    }
}

