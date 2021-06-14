package ui;

public class Arraysdemoapp {

	public static void main(String[] args) {
	System.out.println("Welcome");
	
	// basic arrays
	double[] prices = new double[4];
	prices[0] = 11.12;
	prices[1] = 2.35;
	prices[2] = 4.70;
	prices[3] = 20.22;
	
	for (int i=0; i<prices.length; i++) {
		System.out.println(i+": "+prices[i]);
	}
	// enhanced loop / foreach loop
	
	
	
	
	System.out.println("Bye");
	

	}

}
