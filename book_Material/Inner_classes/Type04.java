// ANonymus inner class

abstract class Demo {

    abstract void display();
}

public class Type04 {

    public static void main(String[] args) {
        Demo d = new Demo() {
            @Override
            void display() {
                System.out.println("Anonymous inner class");
            }
        };
        d.display();
    }
}
