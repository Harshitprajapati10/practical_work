
interface Callback {

    void callback(int param);
}

class Client implements Callback {
    // Implement Callback's interface

    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces "
                + "may also define other members, too.");
    }
}


/*
If a class includes an interface but does not fully implement the methods required by that
interface, then that class must be declared as abstract
*/
abstract class Incomplete implements Callback {

    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
    //...
}

public class TestIface {

    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}
