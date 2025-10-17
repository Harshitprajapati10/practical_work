
// calculate da and hra on basic salary

interface Calculateda{
    double da();
}
interface CalculateHra{
    double Hra();
}
class Calculator implements Calculateda, CalculateHra{
    double salary;
    Calculator(double salary) {
        this.salary = salary;
    }
    @Override
    public double da(){
        return 0.35*salary;
    }
    @Override
    public double Hra(){
        return 0.18* salary;
    }

    public double calculatesalary(){
        return salary + 0.35*salary + 0.18* salary;
    }
}

public class problem02{
    public static void main(String[] args) {
        double basic = 100.0;
        Calculator c = new Calculator(basic);
        System.out.println(c.da());
        System.out.println(c.Hra());
        System.out.println(c.calculatesalary());
        System.out.println("tony");
    }
}