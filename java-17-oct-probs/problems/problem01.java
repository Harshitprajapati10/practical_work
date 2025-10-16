
// write a code to implement the fundamental operation of addition, sub, mul, div by incoroporation the idea of inheritance in java (create two classes one is parent class and other is child class)


class BasicCalculator{
    int num1; int num2;
    BasicCalculator(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int performAddition(){
        return num1 + num2;
    }
    public int performAddition(int a, int b){
        return a+b;
    }
    public int performSubtraction(){
        return num1 - num2;
    }
    public int performSubtraction(int a, int b){
        return a-b;
    }
}

class AdvancedCalculator extends BasicCalculator{
    AdvancedCalculator(int num1, int num2) {
        super(num1, num2);
    }
    public int performMultiplication(){
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result = super.performAddition(result, num1);
        }
        return result;
    }

    public int performDivision(){
        if(num2==0){
            return 0;
        }
        int count = 0;
        int temp = num1;
        while (temp >= num2) {
            temp = super.performSubtraction(temp, num2); 
            count++;
        }
        return count;
    }
}

public class problem01{
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator(12,2);
        System.out.println(calc.performAddition());
        System.out.println(calc.performAddition(23,45));
        System.out.println(calc.performSubtraction());
        System.out.println(calc.performSubtraction(45,55));
        System.out.println(calc.performMultiplication());
        System.out.println(calc.performDivision());
    }
}



