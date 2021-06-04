import java.util.Scanner;


public class Ch3_project2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Travel Time Calculator!!");
		
		System.out.print("Enter Miles: ");
		double miles = sc.nextDouble();
		
		System.out.print("Enter miles per hour: ");
		double mph = sc.nextDouble();
		
		double time = ((mph) / 60);
		double y = (miles / time);
		
		double z = ((((y / 60) * 1000)) / 1000);
		
		
		
		
		System.out.println(z);
		
		
		
		

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
