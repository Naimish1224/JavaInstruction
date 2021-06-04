import java.util.Scanner;

public class Ch3_project2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Travel Time Calculator!!");
		
		System.out.print("Enter Miles: ");
		double miles = sc.nextInt();
		
		System.out.print("Enter miles per hour: ");
		double mph = sc.nextInt();
		
		double time = ((mph) / 60);
		double y = (miles / time );
		
		double z = (y / 60);
		 
		
		
		System.out.println(z);
		
		// have to fix with hour and minutes out put separately
		
		
		

	}

	private static double Time(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double String(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
