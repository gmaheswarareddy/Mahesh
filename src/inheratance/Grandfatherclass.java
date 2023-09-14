package inheratance;

public class Grandfatherclass  extends Parentclass{
	public void Venky() {
		System.out.println("Yellow");
	}
	public void Monkey() {
		System.out.println("Pink");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandfatherclass h = new Grandfatherclass();
		h.Venky();
		h.Monkey();
		h.Mahesh();
		h.Reddy();
		
		
		

	}

}
