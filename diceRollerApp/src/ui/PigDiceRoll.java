package ui;

import java.util.Scanner;

public class PigDiceRoll {

	public static void main(String[] args) {
		System.out.println("|******************************************|");
		System.out.println("  Welcome to the Pig Dice Game, Good Luck!  ");
		System.out.println();
		System.out.println("|******************************************|");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int highestscore = 0;
			int totalrolls = 0;
			int totalscore = 0;
			System.out.print("How many Games you want to play?: ");
			int game = sc.nextInt();
			System.out.println("Here we go!!!!");
			for (int g = 1; g <= game; g++) {
				int sum = 0;
				for (int d = 1;; d++) {
					int roll = (int) ((Math.random() * 6) + 1);
					// can be written as sum+=roll
					sum = sum + roll;
					if (roll == 1) {
						totalrolls = totalrolls + d;
						totalscore = totalscore + sum;
//						System.out.println("Your Score for game " + g + " is " + sum);
//						System.out.println("Total rolls in game " + g + " is " + d);
						if (highestscore < sum) {
							highestscore = sum;
						}
						break;
					}
				}
			}
			System.out.println("You played " + game + " games.");
			System.out.println("Highest score is: " + highestscore);
			System.out.println("Your dice rolled " +totalrolls+ " times in "+ game+" games.");
			System.out.println("your average rolls per game is: " + (totalrolls / game));
			System.out.println("your average score per game is: " + (totalscore / game));
			System.out.println();
			System.out.print("Continue: y/n? ");
			choice = sc.next();
			}
		sc.close();
		System.out.println("Thank you for playing!!");
	}
}
