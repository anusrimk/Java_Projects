// Question 7
package Module_2;
import java.util.*;

public class Complex {
    double imag;
    double real;

    Complex() {
        this.imag = 0;
        this.real = 0;
    }

    Complex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public Complex add(Complex n) {
        double i = this.imag + n.imag;
        double r = this.real + n.real;

        return new Complex(r, i);
    }

    public Complex subtract(Complex n) {
        double i = this.imag - n.imag;
        double r = this.real - n.real;

        return new Complex(r, i);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return this.real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getImag() {
        return this.imag;
    }

    @Override
    public String toString() {
        if (imag < 0) {
            return real + " - " + Math.abs(imag) + "i";
        } else {
            return real + " + " + imag + "i";
        }
    }
}

class ComplexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imag1 = scanner.nextDouble();

        // creating the 1st complex number
        Complex c1 = new Complex(real1, imag1);

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imag2 = scanner.nextDouble();

        // creating the 2nd complex number
        Complex c2 = new Complex(real2, imag2);

        // adding both complex numbers
        Complex sum = c1.add(c2);
        // subtracting both complex numbers
        Complex difference = c1.subtract(c2);

        // Printing results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        scanner.close();
    }
}