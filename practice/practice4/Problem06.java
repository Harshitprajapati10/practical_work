/**
 In the class Vehicle with a method move(), create a subclass Car that overrides move().
 Use super.move() to call the superclass version inside the overridden method.
 */

class Vehicle{
    void move(){
        System.out.println("Moving in vehicle class");
    }
}
class Car extends Vehicle{
    @Override
    void move(){
        super.move();
        System.out.println("Moving in car class");
    }
}

public class Problem06 {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
    }
}
