package practice.lab05;
/*
2. Create a class Employee with fields name, id, designation, and salary. Implement
multiple constructors that initialize different combinations of these fields, and ensure that they
chain to a primary constructor using the this() keyword.
*/

class Employee {
    String name;
    int id;
    String designation;
    int salary;

    // ✅ Primary constructor (initializes all fields)
    Employee(String name, int id, String designation, int salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    // ✅ Constructor with name and id
    Employee(String name, int id) {
        this(name, id, "Not Assigned", 0); // calls primary constructor
    }

    // ✅ Constructor with name, id, and designation
    Employee(String name, int id, String designation) {
        this(name, id, designation, 0); // calls primary constructor
    }

    // ✅ Display method to show employee details
    void display() {
        System.out.println("Name: " + name + ", ID: " + id + 
                           ", Designation: " + designation + ", Salary: " + salary);
    }

}

public class P2employee{
    public static void main(String[] args) {
        Employee e1 = new Employee("Harshit", 101);
        Employee e2 = new Employee("Riya", 102, "Developer");
        Employee e3 = new Employee("Aman", 103, "Manager", 80000);

        e1.display();
        e2.display();
        e3.display();
    }
}