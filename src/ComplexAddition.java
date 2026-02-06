import java.util.Scanner;
class Complex {
      double real;
      double imaginary;
      
     Complex(double real, double imaginary){
               this.real = real;
               this.imaginary = imaginary;
     }
     Complex add(Complex c){
            double newReal = this.real + c.real;
            double newImaginary = this.imaginary + c.imaginary;
            return new Complex(newReal, newImaginary);
     }
     void display(){
            System.out.println(real + " + " + imaginary + "i");
      }
      
      public static void main(String[] args){
                Complex c1 = new Complex(3, 4);
                Complex c2 = new Complex(2,5);
               
                Complex result = c1.add(c2);
                System.out.print("Sum = ");
                result.display();
     }
}
