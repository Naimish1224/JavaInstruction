import java.util.Scanner;
public class Area_Perimeter_Calculator {

	public static void main(String[] args) {
		System.out.println("Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Length: ");
		double length = sc.nextDouble();
		System.out.print("Width: ");
		double width = sc.nextDouble();
		double area = ((length) * (width));
		System.out.println("Area: " +area);
		
		
		
	

		
//		
//		sc.close();
//		System.out.println("Bye");
	}


private static String getNextString(Scanner sc, String prompt) {
	System.out.print(prompt);
	return sc.next();
}

private static double getNextdouble(Scanner sc, String prompt) {
	System.out.print(prompt);
	return sc.nextDouble();
}
}