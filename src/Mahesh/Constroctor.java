package Mahesh;

public class Constroctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reddy f1=new Reddy();
		f1.hyderabad();
		Reddy f2=new Reddy(30,40);
			}

		}
		class Reddy{
			Reddy()//default constructor
			{
				System.out.println("this is constructor");
			}
			Reddy(int a,int b){// argument constructor 
				System.out.println("the addition of "+a+"and"+b+"is:"+(a+b));
			}
			public void hyderabad() {
				System.out.println("Proddatur");

	}

}
