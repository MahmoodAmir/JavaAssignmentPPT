package javaAssignment2;
class ArmstrongRange {
	public static void main(String[] args)  {
		for(int k=100; k<1000;k++) {
			int c=0,a;
			int n = k;
			
			while(n>0) {
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
				}
			
			if(k==c)
				System.out.println("armstrong number : "+k);
			}
		}
	}
