// create a class with an inner class and use this to refer to the outer class's instance variables or methods.


class OuterClass{
    String outerField = "Outer Field Value";

    class InnerClass{
        void displayOuterField(){
            System.out.println("Accessing from Inner Class: " + OuterClass.this.outerField);
        }
    }

    void createInnerInstance(){
        InnerClass inner = new InnerClass();
        inner.displayOuterField();
    }
}

public class problem09{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerInstance();
    }
}