// write a class chain where 3 methods, return this to allow method chaining.
// ***************************
// public <classname> methodone()
class Chain {
    public Chain methodOne() {
        System.out.println("Method One called");
        return this;
    }

    public Chain methodTwo() {
        System.out.println("Method Two called");
        return this;
    }

    public Chain methodThree() {
        System.out.println("Method Three called");
        return this;
    }
}

public class problem03 {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.methodOne();
        chain.methodTwo();
        chain.methodThree();
        chain.methodOne().methodTwo().methodThree();
    }
}