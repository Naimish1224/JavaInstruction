package ui;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import com.util.Console;


public class TravelManagerApp {
	private static final String ITEM_NOT_FOUND = "No item found for id: ";
	private static final String LOCALTIME = "Local date & time there is: ";
	private static final String BOOK = "Would you like to book it?";
	private static final String CONFIRMATION = "Your flight is booked!!! "
			+ "We have a hotel we can add to package for aditional discount? :";
	private static final String NOFLIGHT = "We do not have any other flights available."
			+ " Please try again later.";
	private static final String DAYS = "how many days you would like to book it? :";
	private static final String ENJOY ="Enjoy your travel!";
	private static final String TOTALCOST = "Your total cost for package is ";
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Travel App!");
		System.out.println();
		LocalDateTime currentTimestamp = LocalDateTime.now();
		LocalDateTime india = currentTimestamp.plus(9, ChronoUnit.HOURS);
		LocalDateTime dubai = currentTimestamp.plus(8, ChronoUnit.HOURS);
		LocalDateTime africa = currentTimestamp.plus(6, ChronoUnit.HOURS);
		LocalDateTime china = currentTimestamp.plus(12, ChronoUnit.HOURS);
		
		
		
		double dollar = 1.00;
		double rupee = 70.11;
		double yen = 6.45;
		double rand = 14.32;
		double dirham = 3.67;
		
		String hotelNY = "Hilton Garden Inn - Manhattan (4*)";
		double hotelNYprice = 99.00;
		String hotelm = "TAJ Resort - Juhu Beach (4*)";
		double hotelmprice = 87.00;
		String hoteld = "Burj Al Arab - Palm Island (7*)";
		double hoteldprice = 402.87;
		String hotels = "Sang Su Resort - Sanghai (4*)";
		double hotelsprice = 102.00;
		String hotela = "Four Season Resort - Cape Town (5*)";
		double hotelaprice = 210.00;
		
		
		double nyflight = 599.98;
		double mflight = 1088.63;
		double aflight = 1599.98;
		double sflight = 920.63;
		double dflight = 1801.3;
		
		displayCountries();
		
		String command = "";
		int days = 0;
		while (command != "Exit") {
			command = Console.getString("City you would like to visit? :");
			System.out.println();
		
		switch(command) {
		case "Mumbai":
			System.out.println("Namaste!!!!!");
			System.out.println(LOCALTIME +india);
			System.out.println("We have a non-stop flight to Mumbai! on "
					+ currentTimestamp.plus(12, ChronoUnit.HOURS)+ " for "+mflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION);
				command = Console.getString(BOOK);
				}
			else {
				System.out.println(NOFLIGHT);
				break;
			}
				if (command.equalsIgnoreCase("Yes")) {
					days = Console.getInt(DAYS);
					System.out.println("Your stay in "+hotelm+" is booked for "+days+
							" nights at "+hotelmprice+" Per night");
					System.out.println(TOTALCOST+ ((hotelmprice*days) + mflight));
					System.out.println("Confirmation no :");
					}
				else {
					System.out.println(ENJOY );
					}
			break;
			
		
		
		case "Newyork":
			System.out.println("Welcome!!!");
			System.out.println(LOCALTIME +currentTimestamp);
			System.out.println("We have a non-stop flight to NEW YORK! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+nyflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION);
				command = Console.getString(BOOK);
				}
			else {
				System.out.println(NOFLIGHT);
				break;
				}
				if (command.equalsIgnoreCase("Yes")) {
					days = Console.getInt(DAYS);
					System.out.println("Your stay in "+hotelNY+" is booked for "+days+
							" nights at "+hotelNYprice+" Per night");
				}
				else {
					System.out.println(ENJOY);
				}
				break;
			
			
		case "Cape Town":
			System.out.println("Welkom!!!!");
			System.out.println(LOCALTIME +africa);
			System.out.println("We have a non-stop flight to Capetown! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+aflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION);
				command = Console.getString(BOOK);
			}
			else {
				System.out.println(NOFLIGHT);
				break;
				}
				if (command.equalsIgnoreCase("Yes")) {
					days = Console.getInt(DAYS);
					System.out.println("Your stay in "+hotela+" is booked for "+days+
							" nights at "+hotelaprice+" Per night");
				}
				else {
					System.out.println(ENJOY);
					}
			break;
			
		
		case "Dubai":
			System.out.println("AAAA OOOOOOOO");
			System.out.println(LOCALTIME +dubai);
			System.out.println("We have a non-stop flight to Dubai! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+dflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION);
				command = Console.getString(BOOK);
			}
			else {
				System.out.println(NOFLIGHT);
				break;
				}
				if (command.equalsIgnoreCase("Yes")) {
					days = Console.getInt(DAYS);
					System.out.println("Your stay in "+hoteld+" is booked for "+days+
							" nights at "+hoteldprice+" Per night");
				}
				else {
					System.out.println(ENJOY);
				}
			break;
		
		
		case "Sanghai":
			System.out.println("Welcome");
			System.out.println(LOCALTIME +china);
			System.out.println("We have a non-stop flight to Shanghai! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+sflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION);
				command = Console.getString(BOOK);
			}
			else {
				System.out.println(NOFLIGHT);
				break;
			}
				if (command.equalsIgnoreCase("Yes")) {
					days = Console.getInt(DAYS);
					System.out.println("Your stay in "+hotels+" is booked for "+days+
							" nights at "+hotelsprice+" Per night");
					}
				else {
					System.out.println(ENJOY);
					}
			break;
		}
		}
		System.out.println("Bye");

	
	
	
	}
	private static void displayCountries() {
		System.out.println("Cities we provide travel assiatance:");
		System.out.println("==================");
		System.out.println("Newyork");
		System.out.println("Mumbai");
		System.out.println("Cape Town");
		System.out.println("Dubai");
		System.out.println("Shanghai");
		System.out.println("Exit");
	}


}
