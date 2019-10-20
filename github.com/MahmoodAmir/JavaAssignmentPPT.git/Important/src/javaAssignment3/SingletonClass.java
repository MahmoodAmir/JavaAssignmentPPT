package javaAssignment3;


class MySingleton {
	private MySingleton() {}
	private static MySingleton var=null;
	public int x=10;
	public static MySingleton getInstance() {
		if(var==null)
			var = new MySingleton();
		return var;
		
	}
 }
public class SingletonClass {
	public static void main(String args[]) {
		
		MySingleton a = MySingleton.getInstance();
	
		a.x = a.x + 10;
		System.out.println("value of a.x : "+a.x);
	}
}
