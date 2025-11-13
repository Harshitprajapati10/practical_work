/*
10.Implement a Human class with two constructors. Create a Student class that calls both the Hum
an constructors in different ways using super().
*/

class Human {
    String name;
    int age;

    // Constructor 1 - default
    Human() {
        System.out.println("Default Human constructor called");
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2 - parameterized
    Human(String name, int age) {
        System.out.println("Parameterized Human constructor called");
        this.name = name;
        this.age = age;
    }
}

class Student extends Human {
    String course;

    // Constructor 1 - calls Human()
    Student(String course) {
        super(); // calls the default constructor of Human
        this.course = course;
        System.out.println("Student constructor (calling default Human) called");
    }

    // Constructor 2 - calls Human(String, int)
    Student(String name, int age, String course) {
        super(name, age); // calls the parameterized constructor of Human
        this.course = course;
        System.out.println("Student constructor (calling parameterized Human) called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}


public class Problem10 {
    public static void main(String[] args) {
        System.out.println("=== Example 1 ===");
        Student s1 = new Student("Mathematics");
        s1.display();

        System.out.println("\n=== Example 2 ===");
        Student s2 = new Student("Harshit", 20, "Computer Science");
        s2.display();
    }
}
