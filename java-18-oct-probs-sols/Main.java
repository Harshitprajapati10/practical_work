
class Parent{
    // Parent() {
    // }
    void show(){
        System.out.println("Parent class show method");
    }
}
class Child extends Parent{
    
    @Override
    void show(){
        System.out.println("Child class show method");
        //super.show();
    }
}



public class Main{
    public static void main(String[] args) {
        // Child c = new Parent(); // compile time error
        // Child c = new Parent();

        Parent p = new Child(); 
        p.show();
    }
}

// check in parent class first, if found then check in child class., if overridden then call child class method