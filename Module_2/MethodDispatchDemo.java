// Question 16
package Module_2;

class Figure {
    double dim1;
    double dim2;

    Figure(double d1, double d2) {
        this.dim1 = d1;
        this.dim2 = d2;
    }

    public double area() {
        return 0;  
    }
}

class Rectangle extends Figure {

    Rectangle(double d1, double d2) {
        super(d1, d2);
    }
    @Override
    public double area() {
        return this.dim1 * this.dim2;
    }
}

class Triangle extends Figure {

    Triangle(double base, double height) {
        super(base, height);  // Call superclass constructor
    }

    @Override
    public double area() {
        return 0.5 * this.dim1 * this.dim2;
    }
}

public class MethodDispatchDemo {
    public static void main(String[] args) {
        // Superclass reference pointing to a Rectangle object (Upcasting)
        Figure figRef = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + figRef.area());

        // Superclass reference pointing to a Triangle object (Upcasting)
        figRef = new Triangle(10, 5);
        System.out.println("Area of Triangle: " + figRef.area());

        // Superclass reference pointing to its own Figure object
        figRef = new Figure(1, 2);
        System.out.println("Area of Figure: " + figRef.area());
    }
}
