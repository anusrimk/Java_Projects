package Daily_Practice_Java;
import java.util.*;

public class ComplexNum {
    double imag;
    double real;

    ComplexNum() {
        this.imag = 0;
        this.real = 0;
    }

    ComplexNum(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public ComplexNum add(ComplexNum n) {
        double i = this.imag + n.imag;
        double r = this.real + n.real;

        return new ComplexNum(r, i);
    }

    public ComplexNum subtract(ComplexNum n) {
        double i = this.imag - n.imag;
        double r = this.real - n.real;

        return new ComplexNum(r, i);
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

    public String toString() {
        if (imag < 0) {
            return real + " - " + Math.abs(imag) + "i";
        } else {
            return real + " + " + imag + "i";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();

        System.out.println("Enter the imaginary part of the first complex number:");
        double imag1 = scanner.nextDouble();

        ComplexNum c1 = new ComplexNum(real1, imag1);

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();

        System.out.println("Enter the imaginary part of the second complex number:");
        double imag2 = scanner.nextDouble();
        
        ComplexNum c2 = new ComplexNum(real2, imag2);

        ComplexNum sum = c1.add(c2);
        ComplexNum difference = c1.subtract(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        scanner.close();
    }
}