// Member inner classes


class Outer{
    private final int x = 10;
    class Inner{
        void show(){
            System.out.println(x);
        }
    }
}
public class Type01{
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}