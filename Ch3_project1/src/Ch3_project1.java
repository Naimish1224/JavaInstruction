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
		
		
		
		
		
		
		

	}

}
