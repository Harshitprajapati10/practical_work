// basic class inheritance , single inheritance

class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        super.eat();
        System.out.println("Animals eats from inherited class");
    }
    public void bark(){
        System.out.println("Dog barks");
    }
}

public class inheritance01{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat(); // inherited
        
    }
    
}