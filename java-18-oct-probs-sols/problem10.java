// Implement a Human class with two constructors. create a Student class that calls both the Human constructors in different scenarios using super keyword.

class Human {
    String name;
    int age;
    Human() {
        this.name = "Unknown";
        this.age = 0;
    }
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Human {
    Student() {
        super();
    }
    Student(String name, int age) {
        super(name, age);
    }
}

public class problem10 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayInfo();
        Student s2 = new Student("Alice", 20);
        s2.displayInfo();
    }
}