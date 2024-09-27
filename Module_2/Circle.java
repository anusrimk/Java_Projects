// Question 1
package Module_2;

public class Circle {
    private double radius = 1.0d;

    Circle(){
        this.radius = 1.0;
    }

    Circle(double r){
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }
}
