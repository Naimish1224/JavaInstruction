import java.util.Scanner;

public class Area_Perimeter_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "Y";
		while (choice.equalsIgnoreCase(choice)) {
			System.out.println("Area and Perimeter Calculator");

			double length = getNextDoubleWithinRange(sc, "Length: ", 1, 1000);
			double width = getNextDoubleWithinRange(sc, "Width: ", 1, 1000);
			double area = ((length) * (width));
			System.out.println("Area: " + area);
			double perimeter = (2 * length) + (2 * width);
			System.out.println("Perimeter: " + perimeter);

			System.out.print("Continue, Y/N? ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Thank you for using the calculator!!");
	}

	private static double getNextDoubleWithinRange(Scanner sc, String prompt, double min, double max) {

		System.out.print(prompt);
		return sc.nextDouble();
	}
}