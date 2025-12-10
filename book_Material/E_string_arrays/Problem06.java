
class ExecutionOrder {

    // I. static block – runs once when the class is loaded
    static {
        System.out.println("Static block: Class is loaded");
    }

    // II. instance block – runs every time an object is created, before constructor
    {
        System.out.println("Instance block: Object is being created");
    }

    // III. method initialize() – called from constructor
    void initialize() {
        System.out.println("initialize() method: Object initialization logic");
    }

    // IV. constructor – calls initialize()
    ExecutionOrder() {
        System.out.println("Constructor: Start");
        initialize();
        System.out.println("Constructor: End");
    }

}

public class Problem06 {

    public static void main(String[] args) {
        System.out.println("main() starts");

        System.out.println("\nCreating first object:");
        ExecutionOrder obj1 = new ExecutionOrder();

        System.out.println("\nCreating second object:");
        ExecutionOrder obj2 = new ExecutionOrder();

        System.out.println("\nmain() ends");
    }
}
