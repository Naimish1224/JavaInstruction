import java.util.Scanner;

public class Ch4_demo1 {

	public static void main(String[] args) {
			
			// Prompt user for purchase price
			// Calculate total incl shipping ($5)
			// Free shipping if purchase price > $50 or Prime member
			
			
			System.out.println("Welcome to our shopping app!!");
			Scanner sc = new Scanner(System.in);
			
			final double SHIPPING = 5;
			
			String choice ="y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Purchase Price: ");
				double purchaseprice = sc.nextDouble();
				
				System.out.println("Prime Member: (true/false) ");
				boolean prime = sc.nextBoolean();
				
				if (purchaseprice < 50) {
					if (!prime) {
						purchaseprice += SHIPPING;
					}
				}
				
			
				
				
				
			}
			
			
		sc.close();
		System.out.println("bye");
		

	}

	
}
