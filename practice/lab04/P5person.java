package practice.lab04;
/*
Write a class Person with a constructor that accepts name and age. Create a subclass
Employee that accepts name, age, and salary, and use super() to initialize the name
and age.
*/

class Person{
    String name; int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person{
    double salary;
    public Employee(String name,int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    
}

public class P5person {
    public static void main(String[] args) {
        Employee emp = new Employee("Harshit", 20, 50000000.0);
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Salary: " + emp.salary);
    }
}
