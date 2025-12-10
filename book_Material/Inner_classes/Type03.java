// Method local inner class

class Outer {
    void demo() {
        class Inner {
            void show() {
                System.out.println("Inside method-local inner class");
            }
        }
        Inner i = new Inner();
        i.show();
    }
}

public class Type03{
    public static void main(String[] args) {
        new Outer().demo();
    }
}