import java.util.*;

class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}

class Result {
    static Complex add(Complex c1, Complex c2) {
        int totalReal = c1.real + c2.real;
        int totalImaginary = c1.imaginary + c2.imaginary;
        return new Complex(totalReal, totalImaginary);
    }
}

class Fifteen {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        Complex c1 = new Complex(s.nextInt(), s.nextInt());
        Complex c2 = new Complex(s.nextInt(), s.nextInt());

        Complex result = Result.add(c1, c2);

        System.out.println(result.real + " + " + result.imaginary + "i");
        s.close();
    }
}