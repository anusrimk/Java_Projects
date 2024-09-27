// Question 9, 11
package Module_2;

// Superclass: Box
public class Box {
    double width;
    double height;
    double breadth;

    Box() {
        this.width = 1;
        this.height = 1;
        this.breadth = 1;
    }

    Box(double width, double height, double breadth) {
        this.width = width;
        this.height = height;
        this.breadth = breadth;
    }

    Box(Box ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.breadth = ob.breadth;
    }

    void volume(int num) {
        System.out.println("Volume of box " + num + " = " + (width * height * breadth));
    }
}

class BoxWt extends Box {
    double weight;

    BoxWt() {
        super();  
        this.weight = 1;
    }

    BoxWt(double width, double height, double breadth, double weight) {
        super(width, height, breadth);  
        this.weight = weight;
    }

    BoxWt(BoxWt ob) {
        super(ob);
        this.weight = ob.weight;
    }

    void print_BoxWt() {
        System.out.println("Box dimensions: " + width + " x " + height + " x " + breadth);
        System.out.println("Weight: " + weight);
    }
}

class BoxColor extends BoxWt {
    String color;
}