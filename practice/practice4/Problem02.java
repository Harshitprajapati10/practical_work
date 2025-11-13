/*
2. Create a class Rectangle with two constructors: one that accepts both width and height, and
another that only accepts width and sets a default height. Use the this() constructor chaining
to avoid redundancy
*/

class Rectangle{
    double width; double height;
    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    Rectangle(double w) {
        this(w,10);
    }
    void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class Problem02 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 8);
        Rectangle r2 = new Rectangle(6); // uses default height = 10

        r1.display(); // Output: Width: 5.0, Height: 8.0
        r2.display(); // Output: Width: 6.0, Height: 10.0
    }
}
