// Question 8
package Module_2;

public class Geometry {
    // Square
    public double getArea(int a){
        return Math.pow(a, 2);
    }

    // Circle
    public double getArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    // Rectangle
    public double getArea(double l, double b){
        return l * b;
    }
}
