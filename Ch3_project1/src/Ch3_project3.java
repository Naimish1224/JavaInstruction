import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigDecimal;



public class Ch3_project3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Interest Calculator!!");

		System.out.print("Enter your loan amount: ");
	    double loan = sc.nextInt();
		
		System.out.print("Enter your interest rate: ");
		double interest = sc.nextInt();
		
		double i = (interest * loan / 10);
		
		System.out.println(i);
		
		

	}

}
