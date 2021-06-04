import java.util.Scanner;

public class Ch3_project3_4 {

	public static void main(String[] args) {
		
	// Welcome Message
	// Input
	// Business Logic
	// Output
	// Bye
		
		
		System.out.println("Welcome to the Change Calculator App: ");
		Scanner sc = new Scanner(System.in);
		
		// While Loop start
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Number of cents (0-99): ");
			
			int cents = sc.nextInt();
			int quarters = cents / 25;
			
			int remainder = cents % 25;
			
			int dimes = remainder / 10;
			remainder = remainder % 10;
			
			int nicles = remainder / 5;
			remainder = remainder % 5;
			
			System.out.println("Quarters: " +quarters );
			System.out.println("Dimes: " +dimes );
			System.out.println("Nickles: " +nicles );
			System.out.println("Pennies: " +remainder );
			
			
			// while loop end
			
			System.out.println("Continue(y/n)? ");
			choice = sc.next();
		
			
		}
		sc.close();
		System.out.println("Bye");
		

		

	}

}
