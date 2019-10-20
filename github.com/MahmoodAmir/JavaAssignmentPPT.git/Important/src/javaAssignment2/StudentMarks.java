package javaAssignment2;
import java.util.Scanner;

class Student{
	int subjectA;
	int subjectB;
	int subjectC;
	public int getSubjectA() {
		return subjectA;
	}
	public void setSubjectA(int subjectA) {
		this.subjectA = subjectA;
	}
	public int getSubjectB() {
		return subjectB;
	}
	public void setSubjectB(int subjectB) {
		this.subjectB = subjectB;
	}
	public int getSubjectC() {
		return subjectC;
	}
	public void setSubjectC(int subjectC) {
		this.subjectC = subjectC;
	}
	
	
}
public class StudentMarks {
	static int average(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		return avg;
	}
	
	static int total(int a, int b, int c) {
		int total = (a+b+c);
		return total;
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student[] a= new Student[3];
		a[0]=new Student();
		a[1]=new Student();
		a[2]=new Student();
		for(Student student :a) {
			System.out.println("Enter the marks for Student : " );

			System.out.println("Enter marks for Subject A");
			student.subjectA = sc.nextInt();
			
			System.out.println("Enter marks for Subject B");
			student.subjectB = sc.nextInt();
			
			System.out.println("Enter marks for Subject C");
			student.subjectC = sc.nextInt();
		}	
		sc.close();
		for(Student student :a) {
			System.out.println("Total for student A : "+total(student.subjectA,student.subjectB,student.subjectC));
			
			System.out.println("Average for student A : "+average(student.subjectA,student.subjectB,student.subjectC));
			System.out.println("\n");
		}
		
		System.out.println("Average for subject A : "+average(a[0].subjectA,a[1].subjectA,a[2].subjectA));
		
		System.out.println("Average for subject B: "+average(a[0].subjectB,a[1].subjectB,a[2].subjectB));
		
		System.out.println("Average for subject C : "+average(a[0].subjectC,a[1].subjectC,a[2].subjectC));
		
	}
}