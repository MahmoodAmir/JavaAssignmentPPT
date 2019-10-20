package javaAssignment3;

public abstract class Shape {
	abstract void draw();
	
	public static void main(String args[]) {
		Shape s1 = new Line();
		Shape s2 = new Rectangle();
		Shape s3 = new Cube();
		s1.draw();
		s2.draw();
		s3.draw();
	}
}

class Line extends Shape {
	void draw() {
		System.out.println("Line Shape draw");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle Shape draw");
	}
}

class Cube extends Shape {
	void draw() {
		System.out.println("Cube Shape draw");
	}
}
