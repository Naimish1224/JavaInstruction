package ui;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Date Time App!");
		
		LocalDateTime currentTimestamp = LocalDateTime.now();
		LocalDate currentDate = LocalDate.now();
		System.out.println("current datetime: " +currentTimestamp);
		System.out.println("current datetime: " +currentDate);
		
		LocalDate halloween = LocalDate.of(2021,  10, 31);
		LocalDate christmas = LocalDate.of(2021,  Month.DECEMBER, 31);
		
		System.out.println("Halloween: "+halloween);
		System.out.println("Halloween: "+christmas);
		
		
		
		
		
		
		
		System.out.println("Bye");
		

	}

}
