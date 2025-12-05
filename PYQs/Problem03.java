class Employee{
    private static int staticid = 0;
    final private int id;
    Employee() {
        staticid += 1;
        this.id = staticid;
    }
    void getId(){
        System.out.println(this.id);
    }
}

public class Problem03{
    public static void main(String[] args) {
        Employee A = new Employee();
        A.getId();
        Employee B = new Employee();
        B.getId();
        Employee A1 = new Employee();
        A1.getId();
        Employee B1 = new Employee();
        B1.getId();
        Employee A2 = new Employee();
        A2.getId();
        Employee B2 = new Employee();
        B2.getId();
    }
}