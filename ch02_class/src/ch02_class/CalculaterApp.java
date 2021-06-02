package ch02_class;

import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {
	System.out.println("Welcome to the calculater app");
	
	// page 55 - Scanner
	Scanner sc = new Scanner(System.in);
	
	
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
	
	//casting page 46
	
	
	
	// page 48 Strings
	
	String fName = "Bob";
	String mName = "Nesta";
	String lName = "Marley";
	String fullName = fName + " " + mName + " " + lName;
	System.out.println(fullName);
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	System.out.println("bye");

	}

}
