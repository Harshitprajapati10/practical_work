// write a class student with field names name and age. create a constructor that uses the this keyword to distinguish between instance variables and parameters.

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

public class problem01{
    public static void main(String[] args) {
        Student student = new Student("Alice", 22);
        student.displayInfo();
    }
}