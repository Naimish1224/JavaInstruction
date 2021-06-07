import java.util.Scanner;

public class Chapter_5_demo {

	public static void main(String[] args) {
	System.out.println("Welcome to the resgistration App!");
	Scanner sc = new Scanner(System.in);
	
	
	String fname = getNextString(sc, "Enter your first name: " );
	String lname = getNextString(sc, "Enter your last name: " );
	int age = getNextInt(sc, "Enter your age: " );
	
	System.out.println("Welcome, "+fname+" "+lname+" ("+age+")");
	
	
	
	sc.close();
	System.out.print("Bye");

	}
	
	// new method to 
	// 1) prompt user for input
	// 2) use scanner to get next string
	private static String getNextString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
		
	}
	
	private static int getNextInt(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.nextInt();
}
}
