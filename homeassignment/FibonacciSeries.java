package homeassignment;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		 // Initialize the first two terms
		int n=10,f1=0,f2=1,f3;
		System.out.println("Fibonacci Series of "+n+"numbers:");
		// Generate and print the Fibonacci series
		for (int i = 0; i < n; i++) {
			 System.out.println(f1+" ");
			f3=f1+f2; // Calculate next term
			f1=f2; // Update first term
			f2=f3; // Update second term

			
			
		}
	}
}
