import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;
import java.math.BigDecimal;



public class Ch3_project3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Interest Calculator!!");

		System.out.print("Enter your loan amount: ");
	    BigDecimal loan = sc.nextBigDecimal();
		
		System.out.print("Enter your interest rate: ");
		BigDecimal interestRate = sc.nextBigDecimal();
		
		BigDecimal interest = loan.multiply(interestRate);
		interest = interest.setScale(2, RoundingMode.HALF_UP);
		
		
		NumberFormat curr = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMaximumFractionDigits(3);
		
		
		System.out.println("Loan Amount: " +curr.format(loan));
		System.out.println("Interestrate: " +pct.format(interestRate));
		System.out.println("Interest: " +curr.format(interest));
		

		
		

	}

}
