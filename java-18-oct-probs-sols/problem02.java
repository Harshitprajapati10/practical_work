// create a class rectangele with two constructors. one that accepts both width and height, and another that accepts width and sets a default height. use the this() constructor chaining to avoid redundancy;

class Myrectangle{
    int width;
    int height;
    Myrectangle(int width) {
        // this.width = width;
        // this.height = 10; 
        this(width,10); // constructor chaining
    }
    Myrectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }  
}

public class problem02 {
    public static void main(String[] args) {
        Myrectangle rect1 = new Myrectangle(5);
        Myrectangle rect2 = new Myrectangle(5, 15);
        System.out.println("Rectangle 1 - Width: " + rect1.width + ", Height: " + rect1.height);
        System.out.println("Rectangle 2 - Width: " + rect2.width + ", Height: " + rect2.height);
    }
}