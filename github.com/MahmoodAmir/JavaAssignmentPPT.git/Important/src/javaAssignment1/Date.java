package javaAssignment1;

class Date {
	int day, month, year;
	

	Date() {
		System.out.println("Default Constructor");
	}

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	void display()
	{
		System.out.println(day+" "+ month +" "+year);
	}

	public static void swap(Date d1, Date d2) 
	{
		Date temp = d1;
		d1 = d2;
		System.out.println(d1);
		d2 = temp;
	} 
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}	


	public static void main(String args[])
	{
		Date d1 = new Date(15, 10, 2019);
		Date d2 = new Date(16, 10, 2019);
		System.out.println("Today's date is : ");
		d1.display();
		System.out.println("Tomorrow's date is : ");
		d2.display();
		swap(d1,d2);

		System.out.println("Today's date is : ");
		d1.display();
		System.out.println("Tomorrow's date is : ");
		d2.display();	
	} 
}