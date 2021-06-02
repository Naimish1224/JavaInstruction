package ch02_class;

import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the calculater app");
	
		
	
	// page 55 - Scanner
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	// page 69 while loop start
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
	System.out.print("Enter a whole number:");
	int n1 = sc.nextInt();
	System.out.print("Enter another whole number:");

	int n2 = sc.nextInt();
	int sum = n1 + n2;
	
	System.out.println("sum = "+sum);
	
	int difference = n1 - n2;
	System.out.println("difference = "+difference);
	
	
	int product = n1 * n2;
	System.out.println("product = "+product);
	
	// quotient
	int quotient = n1 - n2;
	System.out.println("quotient = "+(n2/n1));
	
	int modulas = n2%n1;
	System.out.println("modulas = "+modulas);
	
	// while loop end
	System.out.println("Continue? (y/n)");
	choice = sc.next();
	
	
	}
	
	
	
	
			
	
	
	
	
	
	
	
	
	System.out.println("bye");

	}

}
