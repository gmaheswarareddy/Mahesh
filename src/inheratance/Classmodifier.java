package inheratance;

public class Classmodifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classmodifier s=new Classmodifier();
		s.PublicMethod();
		s.PrivateMethod();
		s.ProtectedMethod();
		s.DefaultMethod();
	
	}
		 public void PublicMethod() {
			 System.out.println("Public method is Done");
		 }
		 private void PrivateMethod() {
			 System.out.println("Private method is Done");
		 }
		 protected void ProtectedMethod() {
			 System.out.println("Protected method is Done");
		 }
		 void DefaultMethod() {
			 System.out.println("DefaultMethod is Done");
	}

}
