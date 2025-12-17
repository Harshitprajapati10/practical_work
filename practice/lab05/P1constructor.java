package practice.lab05;
/**
 * . Write a Java class Student that has multiple constructors. One constructor should accept
student name and ID, while another should accept student name, ID, and grades. Implement
constructor overloading and ensure the constructors call each other using this()
 */

class Student{
    String name; int ID; char grade;
    Student(String name,int ID){
        this.name = name;
        this.ID = ID;
    }
    Student(String name, int ID, char grade){
        this(name, ID);
        this.grade = grade;
    }
    void display() {
        System.out.println("Name: " + name + ", ID: " + ID + ", Grade: " + grade);
    }
}

public class P1constructor{
     public static void main(String[] args) {
        Student s1 = new Student("Harshit", 101);
        Student s2 = new Student("Riya", 102, 'A');

        s1.display();
        s2.display();
    }
}