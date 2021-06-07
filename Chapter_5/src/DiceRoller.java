import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice App!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
		int d1 = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice 1: "+d1+"");
		int d2 = (int) ((Math.random() * 6) + 1);
		System.out.println("Dice 1: "+d2+"");
		int d3 = (d1 + d2);
		System.out.println("Total: " + d3 );
		
		
		System.out.print("Continue, y/n?: ");
		choice = sc.next();
		}
		
		
		sc.close();
		System.out.println("Bye");

	}
	private static String getNextString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}
	private static int getNextInt(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.nextInt();
	}


	}

