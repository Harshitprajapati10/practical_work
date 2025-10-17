// In the class vehicle  with a method move(), create a subclass car that overrides the move(). use super.move() to call the superclass version inside the overridden method.

class Vehicle{
    void move(){
        System.out.println("vehicle is moving");
    }
}

class Car extends Vehicle{
    @Override
    void move(){
        super.move();
        System.out.println("car is moving");
    }
}

public class problem06{
    public static void main(String[] args) {
        System.out.println("problem 06");
        Vehicle v = new Vehicle();
        v.move();
        Vehicle v2 = new Car();
        v2.move();
        Car c = new Car();
        c.move();
    }
}