package inheratance;

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		app obj=new app();
		obj.login(12345);
		obj.login("Mahireddy@gmail.com");
			}
		}
		class app{
			public void login(long contact) {
		System.out.println("Loggin in through mobile number");
			}
			public void login(String mail) {
				System.out.println("Login  in with name");

	}

}
