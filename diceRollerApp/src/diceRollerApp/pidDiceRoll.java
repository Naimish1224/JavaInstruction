package diceRollerApp;

import java.util.Scanner;

public class pidDiceRoll {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pig Dice Game, Good Luck!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		

			int sum = 0;
			System.out.println("Here we go!!!!");
			for (int d = 1;; d++) {
				int roll = (int) (Math.random() * 6 + 1);
				sum = sum + roll;
				if (roll == 1) {
					System.out.println("Your dice rolled " + d +  " times");
					System.out.println("Your Score is : " + sum);
					System.out.print("Continue, y/n?: ");
					choice = sc.next();
				}
			}
		}	
	}

}
