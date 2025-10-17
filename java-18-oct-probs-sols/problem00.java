// WAF with class name calculate area having essential paremaeters(instance vars and methods).overload a function named area in such a way so as to calcuate area of circle rectangle and triangle.

class CalculateArea{
    double area(double length, double breadth){
        return length*breadth;
    }
    double area(double radius){
        return 3.14*radius*radius;
    }
    float area(float base, float height){
        return (base*height)/2;
    }
}

