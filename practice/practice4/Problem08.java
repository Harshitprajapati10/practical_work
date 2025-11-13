/**
 * Create a class Building with overloaded constructors. Then create a class House that
extends Building, and use super() to call different constructors from the superclass based
on input parameters.
 */

class Building {
    int floors;
    String material;

    // Constructor 1: no parameters
    Building() {
        System.out.println("Default Building constructor called");
        this.floors = 1;
        this.material = "Concrete";
    }

    // Constructor 2: one parameter
    Building(int floors) {
        System.out.println("Building with floors constructor called");
        this.floors = floors;
        this.material = "Brick";
    }

    // Constructor 3: two parameters
    Building(int floors, String material) {
        System.out.println("Building with floors and material constructor called");
        this.floors = floors;
        this.material = material;
    }

    void showDetails() {
        System.out.println("Building Details → Floors: " + floors + ", Material: " + material);
    }
}

// Subclass House
class House extends Building {

    // Constructor 1: calls Building()
    House() {
        super(); // calls default constructor of Building
        System.out.println("House default constructor called");
    }

    // Constructor 2: calls Building(int)
    House(int floors) {
        super(floors); // calls Building constructor with one parameter
        System.out.println("House with floors constructor called");
    }

    // Constructor 3: calls Building(int, String)
    House(int floors, String material) {
        super(floors, material); // calls Building constructor with two parameters
        System.out.println("House with floors and material constructor called");
    }
}


public class Problem08 {
    public static void main(String[] args) {
        System.out.println("=== Example 1 ===");
        House h1 = new House();
        h1.showDetails();

        System.out.println("\n=== Example 2 ===");
        House h2 = new House(2);
        h2.showDetails();

        System.out.println("\n=== Example 3 ===");
        House h3 = new House(3, "Wood");
        h3.showDetails();
    }
}
