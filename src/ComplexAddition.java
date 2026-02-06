import java.util.Scanner;
class Complex {
    double real;
    double imaginary;
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        System.out.println((int) result.real + " + " + (int) result.imaginary + "i");

        sc.close();
    }
}
