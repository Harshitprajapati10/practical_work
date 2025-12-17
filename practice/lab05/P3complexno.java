package practice.lab05;
/*
. Design a class ComplexNumber that models complex numbers. Write a copy constructor that
takes another ComplexNumber object and initializes the current object’s real and imaginary
parts with the copied values. 
*/


class ComplexNumber{
    double r; double i;
    ComplexNumber(double real, double imaginary) {
        this.r = real;
        this.i = imaginary;
    }

    ComplexNumber(ComplexNumber c) {
        this.r = c.r;
        this.i = c.i;
    }
    
    void display(){
        System.out.println("complex no. is -> " + this.r + " + " + "i"+this.i);
    }
}

public class P3complexno{
    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(2,3);
        ComplexNumber c2 = new ComplexNumber(c);
        c.display();
        c2.display();
    }
}
