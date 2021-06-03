import java.util.Scanner;

public class RectangleCalApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Rectangular Calculator!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase(choice)) {
		
		
			System.out.println();
			System.out.print("Enter Lenth: ");
			double lenght = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();
			
			double area = lenght * width;
			double perimeter = 2 * lenght + 2 * width;
			
			System.out.println("Area:" +area);
			System.out.println("Perimeter: " +perimeter);
			
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			
		sc.close();
		System.out.println("Bye");
		
		
		
		
		

	}

}
}
