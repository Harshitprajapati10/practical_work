/*
. Create two interfaces Flying and Swimming, each with a method void fly() and void
swim() respectively. Create a class Duck that implements both interfaces and overrides both
methods. Write a test class that demonstrates the Duck's ability to both fly and swim.
*/

interface Flying{
    void fly();
}
interface Swimming{
    void swim();
}

class Duck implements Flying, Swimming{
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class Problem08 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();   // Duck flies
        d.swim();  // Duck swims
    }
}