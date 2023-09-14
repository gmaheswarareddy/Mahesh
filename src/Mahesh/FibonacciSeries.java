package Mahesh;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10; // Change this value to the desired number of terms
	        
	        int a = 0, b = 1;
	        System.out.println("Fibonacci Series up to " + n + " numbers:");
	        
	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            int sum = a + b;
	            a = b;
	            b = sum;
	        }
	}

}
