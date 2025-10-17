// create a parent class Animal with a method makeSound() and a subclass Dog that overrrides this method. use the super keyword to call the parent class's method in the overridden method.

// overloading -> same class
// overriding -> diff class

class Animal{
    void makeSound(){
        System.out.println("Trying to make beep");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Trying to make sound from child class");
        super.makeSound();
    }
}

public class problem04{
    public static void main(String[] args) {
        Dog A = new Dog();
        A.makeSound();
    }
}