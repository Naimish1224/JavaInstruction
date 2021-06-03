import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// chapter 2 - problem-1
		
		System.out.println("Student registration form");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String Firstname = sc.next();
		System.out.print("Enter your Last name: ");
		String Lastname = sc.next();
		System.out.print("Enter your birth year: ");
		String Year = sc.next();
		System.out.println();
		
		
		
		
		System.out.println("Welcome Nick Patel!");
		System.out.println("Your Registration is complete.");
		System.out.print("Your temporary password is: ");
		System.out.print(Firstname + "*"  + Year);
			
			}
		
		

	}


