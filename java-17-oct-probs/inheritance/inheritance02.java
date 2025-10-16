// constructor and super

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    int roll;
    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }
    
}

public  class inheritance02{
    public static void main(String[] args){
        Student A = new Student("harshit stark", 18);
        System.out.println(A.name);
        System.err.println(A.roll);
        System.out.println("This is constructor");
    }
}