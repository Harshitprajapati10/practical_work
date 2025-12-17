package practice.lab04;
//Create a class with an inner class and use this to refer to the outer class’s instance variables or methods.

class Outer{
    String message = "hello from outer class";
    void showMessage(){
        System.out.println("outer class method called");
    }

    class Inner{
        void display(){
            System.out.println("Inner class method called");
            System.out.println("Accessing outer message: " + Outer.this.message);
            Outer.this.showMessage();
        }
    }
}

public class P9inner{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}