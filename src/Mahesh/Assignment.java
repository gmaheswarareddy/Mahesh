package Mahesh;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		computer.namemethod();
		   String str=computer.name; // global varaible//
		   System.out.println(str); 
		   computer2 obj=new computer2();
		   obj.nonmethod();
		   System.out.println(obj.name2);
		   
	}
	}
	  class computer{
		
		  
		  static String  name= "Mahesh";  //STATIC VARAIABLE//
		  public static void namemethod () {  // Static method//
			  System.out.println("print the static method");
		  }
	  }
	  class computer2{
		  String name2="Reddy"; // non static vraiable //
		  public void nonmethod() {   // non static method//
			  System.out.println("print the non staticmethod");
		  }
	  
	}
	 
					  
					  
					  
					  
					  
					  
		


