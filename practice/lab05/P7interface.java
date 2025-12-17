package practice.lab05;
/**
 * Create an interface Shape that has methods double area() and double perimeter()
. Implement this interface in two classes: Circle and Rectangle. The Circle class should
calculate the area and perimeter using the radius, and the Rectangle class should use the
length and width.
 */

interface  Shape{
    double area();
    double perimeter();
}

class Circle implements  Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class P7interface {
    public static void main(String[] args) {
        Shape c = new Circle(5);          // radius = 5
        Shape r = new Rectangle(4, 6);    // length = 4, width = 6

        System.out.println("Circle area: " + c.area());
        System.out.println("Circle perimeter: " + c.perimeter());

        System.out.println("Rectangle area: " + r.area());
        System.out.println("Rectangle perimeter: " + r.perimeter());
    }
}