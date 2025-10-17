// write a class Person with a constructor that accepts name and age. create a subclass Employee that accepts name , age, and salary and use super()  to initialize the name and age

class Person{
    String name; int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    } 
}
class Employee extends Person{
    int salary;
    Employee(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }
}

public class problem05{
    public static void main(String[] args) {
        Employee A = new Employee("Harshit", 21, 100000);
        System.out.println("Name: " + A.name + ", Age: " + A.age + ", Salary: " + A.salary);
    }
}