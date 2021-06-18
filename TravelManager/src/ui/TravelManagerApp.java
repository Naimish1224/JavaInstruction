package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.util.Console;


public class TravelManagerApp {
	private static final String ITEM_NOT_FOUND = "No item found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Item Manager - Text file version");
		System.out.println();
		LocalDateTime currentTimestamp = LocalDateTime.now();
		LocalDate currentDate = LocalDate.now();
		LocalDateTime dayLaterThanToday = currentTimestamp.withDayOfMonth(6);
		LocalDateTime india = currentTimestamp.plus(9, ChronoUnit.HOURS);
		LocalDateTime australia = currentTimestamp.plus(14, ChronoUnit.HOURS);
		LocalDateTime dubai = currentTimestamp.plus(8, ChronoUnit.HOURS);
		LocalDateTime africa = currentTimestamp.plus(6, ChronoUnit.HOURS);
		LocalDateTime china = currentTimestamp.plus(12, ChronoUnit.HOURS);
		
		double dollar = 1.00;
		double rupee = 70.11;
		double yen = 6.45;
		double rand = 14.32;
		double dirham = 3.67;
		
		
		System.out.println(" Where do you want to travel? ");
		displayCountries();
		
		String command = "";
		while (command != "Exit") {
			command = Console.getString("Country: ");
			System.out.println();
		
		switch(command) {
		case "India":
			System.out.println("Namaste!!!!!");
			System.out.println("Local date & time there is: " +india);
		
			
			
			
			
			break;
			
		case "USA":
			System.out.println("Welcome!!!");
			System.out.println("Local date & time there is: " +currentTimestamp);
			System.out.println("We have a non-stop flight to NEW YORK! for "+ currentDate + " at "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS));
			command = Console.getString("Would you like to book it? ", "Yes", "No? :");
			if (command == "Yes") {
				System.out.println("Your flight is booked!!! ");
			}
			else {
				System.out.println("We do not have any other flights for today. Would you like to see some great hotels arround there? :");
				command = Console.getString("Would you like to book it? ", "Yes", "No? :");
						
			}
			
			
			break;
			
		case "Australia":
			System.out.println("Welcome Mate!!!!");
			System.out.println("Local date & time there is: " +australia);
			
			
			break;
			
		case "Africa":
			System.out.println("Welkom!!!!");
			System.out.println("Local date & time there is: " +africa);
			
			break;
			
		case "Dubai":
			System.out.println("AAAA OOOOOOOO");
			System.out.println("Local date & time there is: " +dubai);
			
			break;
		
		case "China":
			System.out.println("Welcome");
			System.out.println("Local date & time there is: " +china);
			
			break;
		}
		
		
		}
		
		System.out.println("Bye");

	}
	private static void displayCountries() {
		System.out.println("Countries we provide travel assiatance:");
		System.out.println("==================");
		System.out.println("USA");
		System.out.println("India");
		System.out.println("Africa");
		System.out.println("Dubai");
		System.out.println("China");
		System.out.println("Exit");
	}

}
