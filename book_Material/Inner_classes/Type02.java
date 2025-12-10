// Static inner class

class Outer {

    static int x = 20;

    static class Inner {

        void show() {
            System.out.println("x = " + x);
        }
    }
}

public class Type02 {

    public static void main(String[] args) {
        Outer.Inner o = new Outer.Inner();
        o.show();
    }
}
