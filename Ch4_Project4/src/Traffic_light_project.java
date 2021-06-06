import java.util.Scanner;

public class Traffic_light_project {

	private static final String String = null;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Traffic Light App!" );
		System.out.println();
		
		System.out.print("Enter the currentcolor of the light: ");
		String color = sc.next();
		
		if (color.equals("Green")) { 
			System.out.println("You can Go! ");
		}
		
		
		if (color.equals("Red")) { 
			System.out.println("Are you turning right? :");
		}
		
		
		
		if (color.equals("Yellow")) { 
			System.out.print("How many yards away are you from Traffic Light? : ");
		}
		
		int distance = sc.nextInt();
		if (distance > 30) {
			System.out.println("Please Stop slowly! ");
		}
		else {System.out.println("Please Go with cautious! ");
		}
		
	
	
	
	
	
	
	
	
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
