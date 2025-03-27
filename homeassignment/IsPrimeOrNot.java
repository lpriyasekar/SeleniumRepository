package homeassignment;

//Given number is prime of not

public class IsPrimeOrNot {

	public static void main(String[] args) {
		
		int num=6;
		if (num%2==0) {
			System.out.println("Given number is not PrimeNumber.");
			
		}else if (num==0||num==1) {
			System.out.println("Given number is composite");
		}else {
			System.out.println("Given number is Prime");
		}
			
		
	}
}
