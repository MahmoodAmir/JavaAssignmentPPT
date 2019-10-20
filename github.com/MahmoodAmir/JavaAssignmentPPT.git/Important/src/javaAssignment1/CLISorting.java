package javaAssignment1;
import java.util.Arrays;

public class CLISorting {
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++)
		{
			Arrays.sort(args);
		}
		System.out.println(Arrays.toString(args));
	}
}