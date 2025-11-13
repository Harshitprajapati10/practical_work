// define a class point with two fields x and y each of type double. also , define a method distance(Point p1, Point p2) to calculate the distace b/w the poitns p1 and p2 and reutrn the value into double


class Point{
    double x; double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}

public class Problem02{

    static double getSqrt(double n, double eps) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative input: sqrt undefined for negatives.");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        double low = 0.0;
        double high = Math.max(1.0, n); // ensures interval covers roots < 1 too

        while (high - low > eps) {
            double mid = (low + high) / 2.0;
            double midSq = mid * mid;

            if (midSq == n) {
                return mid; // exact
            } else if (midSq < n) {
                low = mid;  // root is >= mid
            } else {
                high = mid; // root is < mid
            }
        }
        return (low + high) / 2.0;
    }

    static double calculateDistance(Point s, Point e){
        double distanceSq = ((s.x - e.x) * (s.x - e.x)) + ((s.y - e.y) * (s.y - e.y));
        return getSqrt(distanceSq, 1e-12);
    }
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new  Point(3,4);
        double d = calculateDistance(p1, p2);
        System.out.println("Distance = " + d);
    }
}

