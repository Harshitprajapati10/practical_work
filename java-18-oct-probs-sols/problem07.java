

class Parent{
    void display(){
        System.out.println("display from parent class");
    }
}
class Child extends Parent{
    @Override
    void display(){
        super.display();
        System.out.println("display from child class");
        //this.display();
    }
}

public class problem07{
    public static void main(String[] args) {
        Parent c = new Child();
        c.display();
    }
}