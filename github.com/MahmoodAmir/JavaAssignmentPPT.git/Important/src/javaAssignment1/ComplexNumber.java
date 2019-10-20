package javaAssignment1;

public class ComplexNumber {
	double real, imaginary;

	ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber cn = new ComplexNumber(0, 0);

		cn.real = c1.real + c2.real;
		cn.imaginary = c1.imaginary + c2.imaginary;

		return cn;
	}

	public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber cn = new ComplexNumber(0, 0);

		cn.real = c1.real - c2.real;
		cn.imaginary = c1.imaginary - c2.imaginary;

		return cn;
	}

	public static ComplexNumber div(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber cn = new ComplexNumber(0, 0);

		cn.real = c1.real / c2.real;
		cn.imaginary = c1.imaginary / c2.imaginary;

		return cn;
	}

	public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber cn = new ComplexNumber(0, 0);

		cn.real = c1.real * c2.real;
		cn.imaginary = c1.imaginary * c2.imaginary;

		return cn;
	}

	public static void main(String args[]) {
		ComplexNumber c1 = new ComplexNumber(5.5, 4);
		ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
		ComplexNumber cn1 = sum(c1, c2);
		ComplexNumber cn2 = sub(c1, c2);
		ComplexNumber cn3 = div(c1, c2);
		ComplexNumber cn4 = mul(c1, c2);

		System.out.println("Sum is : " + cn1.real + " + " + cn1.imaginary + "i");
		System.out.println("Sub is : " + cn2.real + " - " + cn2.imaginary + "i");
		System.out.println("Div is : " + cn3.real + " / " + cn3.imaginary + "i");
		System.out.println("Mul is : " + cn4.real + " * " + cn4.imaginary + "i");
	}
}