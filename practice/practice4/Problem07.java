

/**
 * Write a class Parent with a method display(), and a subclass Child with a constructor
that uses super() to call the parent class constructor. Use both super.display() and
this.display() in the child class.
 */

class Parent{
    Parent(){
        System.out.println(" const form parent class");
    }
    void display(){
        System.out.println("display from parent class");
    }
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("const from child class");
        super.display();
        this.display();
    }
    @Override
    void display(){
        System.out.println("display from child class");
    }

}


public class Problem07 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
