package inheratance;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monday obj=new Monday();
		obj.Chicken();
			
	}

}
class Sunday{
	public void Chicken(){
		System.out.println("iam done with Lunch");
	}
}
class Monday extends Sunday{
	public void Chicken() {
		
	System.out.println("iam done with Dinner");
}
}