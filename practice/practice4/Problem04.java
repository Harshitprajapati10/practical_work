/*
4. Create a parent class Animal with a method makeSound() and a subclass Dog that
overrides this method. Use the super keyword to call the parent class's method in the
overridden version.
*/

class Animal{
    void makeSound(){
        System.out.println("sound from animal class");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("sound from dog class");
    }
}

public class Problem04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
