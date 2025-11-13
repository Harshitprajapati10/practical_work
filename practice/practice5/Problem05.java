/**
 * Write an abstract class Shape that has a parameterized constructor to initialize the color of the
shape. Extend this class in Circle and Rectangle, which will have their own additional
parameters (like radius, length, width). Ensure proper constructor calls using super()
 */

abstract class Shape{
    String color;
    Shape(String color){
        this.color = color;
    }
    abstract double area();
    abstract void display();
}


class Circle extends Shape{
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double area(){
        return 3.14*this.radius*this.radius;
    }
    @Override
    void display(){
        System.out.println("circle have radius "+ this.radius);
    }
}
class Rectangle extends Shape{
    double width; double height;
    Rectangle(String color, double w, double h){
        super(color);
        this.width = w;
        this.height = h;
    }
    @Override
    double area(){
        return this.width*this.height;
    }
    @Override
    void display(){
        System.out.println("rect is have w,h "+ this.width+" "+this.height);
    }
}

public class Problem05{
    public static void main(String[] args) {
        Circle c = new Circle("green",67);
        Rectangle r = new Rectangle("red",5,6);
        System.out.println(c.area());
        c.display();
        System.out.println(r.area());
        r.display();
    }
}