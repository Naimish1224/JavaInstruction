
import java.util.Scanner;



public class Project_ch2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			
			
			
			// Problem project 2
			
			System.out.println("Welcome to the letter grade Converter");
			System.out.println();
			
			String Grade1 = "Your grade is: A";
			
			String Grade2 = "Your grade is: B";
			
			String Grade3 = "Your grade is: C";
			
			String Grade4 = "Your grade is: D";
			
			String Grade5 = "Your grade is: E";
			
			System.out.print("Enter numerical grade: ");
			int G1 = sc.nextInt();
			
			if (G1 >= 90 && G1 <= 100) { 
				System.out.println(Grade1);}
			if (G1 >= 88 && G1 <= 89) {
				System.out.println(Grade2);}
			if (G1 >= 80 && G1 <= 87) {
				System.out.println(Grade3);}
			if (G1 >= 60 && G1 <= 79) {
				System.out.println(Grade4);}
			if (G1 < 59) {
				System.out.println(Grade5);}
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

		 {
			// TODO Auto-generated method stub
			
		}
}
