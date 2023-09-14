package Mahesh;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original = "Mahesh reddy!";
	        String reversed = "";
	        
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reversed += original.charAt(i);
	        }
	        
	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String (using loop): " + reversed);

	}

}
