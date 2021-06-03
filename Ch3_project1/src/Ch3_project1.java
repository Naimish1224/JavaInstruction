import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ch3_project1 {

	public static void main(String[] args) {
		
		// implicit casting p.96
		double grade = 93;
		double d = 95.0;
		int i = 86, j = 91;
		double average = (d+i+j)/3;
		System.out.println("ave= "+average);
		
		//explicit cast
		int grade2 = (int) 93.75;
		System.out.println("grade"+grade2);
		int average2 = ((int)d+i+j) / 3;
		int remainder = ((int)d+i+j) % 3;
		System.out.println("average: = "+average2+", remainder = "+remainder);
		
		// p. 102 math class
		//round
		double percent = Math.round(.0325);
		System.out.println("percent = " +percent);
		// round to thousands (3 decimal)
		percent = (double)Math.round(.0325 * 1000) / 1000;
		System.out.println("percent = " +percent);
		
		//pow
		System.out.println(Math.pow(2, 3));
		
		//square root
		System.out.println(Math.sqrt(25));
		
		// min/mx
		
		System.out.println(Math.min(11.7, 23.4));
		System.out.println(Math.max(11.7, 23.4));
		
		// random
		
		System.out.println(Math.random());
		
		// die roll (1-6)
		
		int die = (int)(Math.random()*6)+1;
		System.out.println("die = "+die);
		
		//random # 1 to 100
		
		int rand = (int)(Math.random()*100)+1;
		System.out.println("rand = "+rand);
		
		
		//numberFormat - currency  p.105
		
		double price = 11222.575;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("formated price = "+currency.format(price));
		
		double majority = .505;
		NumberFormat percent2 = NumberFormat.getPercentInstance();
		System.out.println(percent2.format(majority));
		
		double miles = 15341.253;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		System.out.println(number.format(miles));
		
		
		
		// Bigdecimal p 133
		
		BigDecimal subtotal = new BigDecimal("100.05");
		BigDecimal discountPct = new BigDecimal(".1");
		final BigDecimal SALES_TAX_PCT = new BigDecimal(".05");
		BigDecimal discountAmt = subtotal.multiply(discountPct);
		discountAmt = discountAmt.setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal totalBeforeTax = subtotal.subtract(discountAmt);
		BigDecimal salesTax = totalBeforeTax.multiply(SALES_TAX_PCT);
		
		BigDecimal Total = totalBeforeTax.add(salesTax);
		
		System.out.println("Subtotal: \t"+currency.format(subtotal));
		System.out.println("Discount Pct: \t "+percent2.format(discountPct));
		System.out.println("Discount Amt: \t"+currency.format(discountAmt));
		System.out.println("Total Before Tax: \t"+currency.format(totalBeforeTax));
		System.out.println("Sales Tax: "+currency.format(salesTax));
		System.out.println("Total: \t "+currency.format(Total));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
