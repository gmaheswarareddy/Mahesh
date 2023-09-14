package Mahesh;

public class Duplicatech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "Mahesh reddy";
	        
	        int[] charCount = new int[256]; // Assuming ASCII characters
	        
	        System.out.println("Input String: " + input);
	        System.out.print("Duplicate Characters: ");
	        
	        for (char c : input.toCharArray()) {
	            charCount[c]++;
	        }
	        
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > 1) {
	                System.out.print((char) i + " ");
	            }
	        }

	}

}
