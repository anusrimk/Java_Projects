// Question 17
package Module_2;

interface Figure {
    double PI = 3.14;

    double area();
    double perimeter();
}

interface Draw {
    void draw();
}

class Rectangle implements Figure, Draw {
    double length;
    double breadth;

    Rectangle(double b, double l) {
        this.breadth = b;
        this.length = l;
    }

    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public double perimeter() {
        return (2 * (this.length + this.breadth));
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }
}

class Circle implements Figure, Draw {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Area of Circle: " + c1.area());
        System.out.println("Perimeter of Circle: " + c1.perimeter());
        c1.draw();  // Demonstrate draw() for Circle

        System.out.println();

        Rectangle r1 = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Perimeter of Rectangle: " + r1.perimeter());
        r1.draw();  // Demonstrate draw() for Rectangle
    }
}
