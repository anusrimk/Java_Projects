// Question 21
package Module_2;

abstract class Shape {
    // Abstract methods to calculate area and circumference
    public abstract double calculateArea();

    public abstract double calculateCircumference();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // No-arg constructor
    Circle() {
        this.radius = 0.0;
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of calculateCircumference method
    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// SemiCircle class extending Shape
class SemiCircle extends Shape {
    private double radius;

    // No-arg constructor
    SemiCircle() {
        this.radius = 0.0;
    }

    // Parameterized constructor
    SemiCircle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method
    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius) / 2;
    }

    // Implementation of calculateCircumference method
    @Override
    public double calculateCircumference() {
        return Math.PI * radius + 2 * radius; // Semi-circle's circumference includes the straight edge
    }
}

// Test class
public class ShapeTest {
    public static void main(String[] args) {
        // Test Circle
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        // Test SemiCircle
        SemiCircle semiCircle = new SemiCircle(5);
        System.out.println("SemiCircle Area: " + semiCircle.calculateArea());
        System.out.println("SemiCircle Circumference: " + semiCircle.calculateCircumference());
    }
}
