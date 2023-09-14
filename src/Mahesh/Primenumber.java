package Mahesh;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for (int i=1; i<=50;i++) {   // outer forloop
			 boolean isPrime = true;
			 if (i>1) {
				 for (int j=2; j<i; j++ ){ // inner  forloop
					 if (i%j==0)  {        //Arthamatic operator
						 isPrime = false;
					 }
				 }
				  
			 } else {
				 isPrime = false;
			 }
			 
			if(isPrime) {
				System.out.print(i+" ");
			}
		 }

	}

}
