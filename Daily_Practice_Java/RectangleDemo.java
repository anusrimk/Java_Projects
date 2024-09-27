package Daily_Practice_Java;

// create a rectangle class with instance variables length and breadth. Create a no-argument constructor and parameterised constructor, and add methods to get the area, perimeter and override the toString method to display the area and perimeter. 

public class RectangleDemo {
    double length;
    double breadth;

    RectangleDemo(){
        this.breadth = 0;
        this.length = 0;
    }

    RectangleDemo(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    public double getArea(){
        return this.length * this.breadth;
    }

    public double getPerimeter(){
        return (2 * (this.length + this.breadth));
    }

    @Override
    public String toString(){
        return ("Area = " + getArea()+" cm2\nPerimeter = "+getPerimeter()+" cm");
    }

    public static void main(String[] args) {
        RectangleDemo r1 = new RectangleDemo(5, 8);
        System.out.println(r1.toString());
    }
}