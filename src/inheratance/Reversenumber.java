package inheratance;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str= "1234", nstr="";
        char ch;
       
      System.out.print("1234: ");
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);

}

	}


