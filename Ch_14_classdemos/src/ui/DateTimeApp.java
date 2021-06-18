package ui;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

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
		
		LocalDate july4th = LocalDate.parse("2021-07-04");
		System.out.println("July 4th: "+july4th);
		LocalDateTime laborday = LocalDateTime.parse("2021-09-06T00:00");
		System.out.println("Labor Day = "+laborday);
		
		System.out.println("Labor day 2021");
		System.out.println("getYear(): "+currentTimestamp.getYear());
		System.out.println("getMonth(): "+currentTimestamp.getMonth());
		System.out.println("getMonthValue(): "+currentTimestamp.getMonthValue());
		System.out.println("getDayofMonth(): "+currentTimestamp.getDayOfMonth());
		System.out.println("getDayofYear(): "+currentTimestamp.getDayOfYear());
		System.out.println("getDayofweek(): "+currentTimestamp.getDayOfWeek());
		System.out.println("getHour(): "+currentTimestamp.getHour());
		System.out.println("getMinute(): "+currentTimestamp.getMinute());
		System.out.println("getSecond(): "+currentTimestamp.getSecond());
		System.out.println("getNano(): "+currentTimestamp.getNano());
		
		
		if (currentTimestamp.isBefore(laborday)) {
			System.out.println("Today is before Laborday");
		}
		if (christmas.isAfter(halloween)) {
			System.out.println("the Xmas is after halloween");
		}
		
		
		//results in months
		System.out.println("x.compareto method in months results: ");
		System.out.println(halloween.compareTo(christmas));
		System.out.println(christmas.compareTo(july4th));
		
		
		//New Date 1 month from today
		System.out.print("1 month from today: ");
		LocalDateTime monthLaterThanToday = currentTimestamp.withMonth(7);
		System.out.println(monthLaterThanToday);
		
		//10 weeks from today
		System.out.print("10 Weeks from today: ");
		LocalDateTime tenweeks = currentTimestamp.plus(10, ChronoUnit.WEEKS);
		System.out.println(tenweeks);
		
		//2 weeks from today
		System.out.print("10 days from today: ");
		LocalDateTime twoweeks = currentTimestamp.plus(10, ChronoUnit.DAYS);
		System.out.println(twoweeks);
		
		
		System.out.println("Bye");
		

	}

}
