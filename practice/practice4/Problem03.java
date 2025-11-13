/*
3. Write a class Chain where methods step1(), step2(), and step3() return this to
allow method chaining
*/

class Chain{
    public Chain step1(){
        System.out.println("this is step1");
        return this;
    }
    public Chain step2(){
        System.out.println("this is step2");
        return this;
    }
    public Chain step3(){
        System.out.println("this is step3");
        return this;
    }
}

public class Problem03{
    public static void main(String[] args) {
        Chain c = new Chain();
        c.step1();
        c.step2();
        c.step3();
        c.step1().step2().step3();
    }
}