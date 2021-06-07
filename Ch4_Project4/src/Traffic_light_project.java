import java.util.Scanner;

public class Traffic_light_project {

	private static final String String = null;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase(choice)) {
			
		
		System.out.println("Welcome to Traffic Light App!" );
		
		
		System.out.print("Enter the currentcolor of the light: ");
		String color = sc.next().toLowerCase();
		
		
		if (color.equals("green")) { 
			System.out.println("You can Go! ");
		}
		
		
		else if (color.equals("red")) { 
			System.out.print("Are you turning right? Yes/No? : ");
			String yesno = sc.next().toLowerCase();
			if (yesno.equals("yes")) {
				System.out.println("Please turn right with caution! ");
			}
			else {System.out.println("Please Stop! ");
			}
		}
		
		
		else if (color.equals("yellow")) { 
			System.out.print("How many yards away are you from Traffic Light? : ");
			int distance = sc.nextInt();
			if (distance >= 30) {
				System.out.println("Please Stop slowly! ");
			}
			else {System.out.println("Please Go with caution! ");
			}
		}
		
		else {
			System.out.println("Please enter a valid color! Try again! ");
			System.out.println();
		}
		}
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		
		
		sc.close();
		System.out.println("Drive Safe! ");
		}
		
	
	
	
	
	
	
	
	
	private static boolean Bollean(java.lang.String string2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static Object Color(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
