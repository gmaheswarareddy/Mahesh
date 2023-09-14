package inheratance;

public class Lastdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int number = 4512;
        printLastDigit(number);
    }

    public static void printLastDigit(int num) {
        int lastDigit = getLastDigit(num);
        System.out.println("Last digit of " + num + " is: " + lastDigit);
    }

    public static int getLastDigit(int num) {
        return num % 10;
	}

}
