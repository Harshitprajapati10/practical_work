// classes and objects

//1. Write a class Student with fields name and age. Create a constructor that uses the this keyword to distinguish between instance variables and parameters.

class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age; 
    }
    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class Problem01 {
    public static void main(String[] args) {
        Student s1 = new Student("Harshit", 20);
        Student s2 = new Student("Aman", 22);

        s1.displayInfo(); // Output: Name: Harshit, Age: 20
        s2.displayInfo(); // Output: Name: Aman, Age: 22
    }
}
