package Mahesh3;

public class Lastdigit {

	public int last(int num) {
		int rem=num%10;
		return rem;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lastdigit k = new Lastdigit();
		   int res = k.last(3456789);
		   System.out.println(res);
	

	}

}
