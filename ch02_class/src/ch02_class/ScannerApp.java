package ch02_class;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
	System.out.println("Hi");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a sentence: ");
	String sentence1 = sc.next();
	String sentence2 = sc.next();
	String sentence3 = sc.next();

	System.out.println(sentence1);
	System.out.println(sentence2);
	System.out.println(sentence3);
	
	sc.nextLine();
	
	System.out.println("Another Sentence: ");
	String sentence4 = sc.nextLine();
	System.out.println(sentence4);
	
	// page 67 if else
	
	System.out.println("Enter a whole no: ");
	int n1 =  sc.nextInt();
	 
	// determine if user entry is negative even or odd
	if (n1 < 0) {
		System.out.println("your entry is negative"); }
		
		else if (n1 % 2 == 0) {System.out.println("Your entry is even"); }
	
		else {
			System.out.println("Your entry is odd"); }
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


