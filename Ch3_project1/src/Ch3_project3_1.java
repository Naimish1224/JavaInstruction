import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;


public class Ch3_project3_1 {

	public static void main(String[] args) {
		
		
		
		Scanner reader = new Scanner(System.in);
		do {
		
			System.out.println("Welcome to the Temperature Converter!");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("Enter the degrees in fahrenheit: ");
		double degree = sc.nextInt();
		double fdegree = ((degree) - 32) * 5 / 9;
		double fd = Math.round(fdegree * 100 / 100);
		String fd2 = ("Degree in celcius is: "); 
		
		System.out.print(fd2);
		System.out.print(fd);
		System.out.println();
		System.out.print("Do you want to calculate another entry? (Y/N)? ");
		}
		while(reader.equals("y"));
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
	

	private static double String(double degree) {
		// TODO Auto-generated method stub
		return 0;
	}

}
