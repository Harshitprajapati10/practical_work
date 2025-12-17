

public class P5calcSI{

    static double getCI(double p, double r, double t, double n){
        double amount = p * Math.pow((1 + (r / (n * 100))), n * t);
        return amount - p;
    }
    public static void main(String[] args) {
        double principal = 10000; 
        double rate = 10;         
        double time = 2;          
        double n = 4;  
        System.out.println(getCI(principal, rate, time, n));
    }
}