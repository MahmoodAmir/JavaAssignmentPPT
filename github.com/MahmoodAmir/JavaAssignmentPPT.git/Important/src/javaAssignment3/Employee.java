package javaAssignment3;

class Manager extends Employee{
	int incentive;
	Manager(int basic, int incentive) {
		super(basic);
		this.incentive = incentive;
	}
	
	int Calculate() {
		int cal = basic + incentive;
		return cal;
	}

}

class Labour extends Employee {
	int overTime;
	Labour(int basic, int overTime) {
		super(basic);
		this.overTime = overTime;
	}
	
	int Calculate() {
		int cal = basic + overTime;
		return cal;
	}

}


public class Employee {
	int basic;
	Employee(int basic) {
		this.basic = basic;
	}

	int Calculate() {
		int cal = basic;
		return cal;
	}

	
	public static void main(String args[]) {
		Labour l =new Labour(5000, 500);
		Manager m = new Manager(7500, 2000);
		System.out.println("Labour Salary : "+l.Calculate());
		System.out.println("Manager Salary : "+m.Calculate());			
	}
	
}
