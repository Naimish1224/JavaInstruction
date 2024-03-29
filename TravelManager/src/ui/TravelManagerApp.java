package ui;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import com.util.Console;
public class TravelManagerApp {
	private static final String LOCALTIME = "Local date & time there is: ";
	private static final String BOOK = "Book it? :";
	private static final String CONFIRMATION = "Your flight is booked!!! "
			+ "Found Hotel ";
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
		
		Currency us = Currency.getInstance(Locale.US);  

		String hotelNY = "Hilton Garden Inn - Manhattan (4*) & flight UA-0000";
		double hotelNYprice = 99.00;
		String hotelm = "TAJ Resort - Juhu Beach (5*) & flight AI-2200";
		double hotelmprice = 87.00;
		String hoteld = "Burj Al Arab - Palm Island (7*) & flight DB-0890";
		double hoteldprice = 402.87;
		String hotels = "Sang Su Resort - Sanghai (4*) & flight CN-48";
		double hotelsprice = 102.00;
		String hotela = "Four Season Resort - Cape Town (5*) & flight AF-223";
		double hotelaprice = 210.00;
		
		
		double nyflight = 599.98; double mflight = 1088.63; double aflight = 1599.98;
		double sflight = 920.63; double dflight = 1801.3;
		
		String menu = "";
		String command = "";
		HashMap<Integer, String> reservations = new HashMap<>();
		int days = 0;
		while (command != "Exit") {
			displayMenu();
			menu = Console.getString("How can we help you? :");
			System.out.println();
		switch (menu.toUpperCase()) {
		case "BOOK":
			displayCountries();
			command = Console.getString("What city? :");
			
			switch(command.toUpperCase()) {
			case "MUMBAI":
				System.out.println();
			System.out.println("Namaste!!!!!");
			System.out.println(LOCALTIME +india);
			System.out.println("We have a non-stop flight to Mumbai! at "
					+ currentTimestamp.plus(12, ChronoUnit.HOURS)+ " for "+us.getSymbol()+mflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION+"at "+hotelm+" package? :");
				command = Console.getString(BOOK);
				}
			else {
				System.out.println(NOFLIGHT);
				break;
			}
				if (command.equalsIgnoreCase("Yes")) {
					days = Console.getInt(DAYS);
					System.out.println("Your stay in "+hotelm+" is booked for "+days+
							" nights at "+us.getSymbol()+hotelmprice+" Per night");
					System.out.println(TOTALCOST+us.getSymbol()+ ((hotelmprice*days) + mflight));
					int confirmationno = (int)Math.round(Math.floor(100000 + Math.random() * 900000)) ;
					System.out.println("Confirmation no :"+confirmationno);
					reservations.put(confirmationno, hotelm);
				}else {
					System.out.println(ENJOY );
					}
			break;
		case "NEWYORK":
			System.out.println("Welcome!!!");
			System.out.println(LOCALTIME +currentTimestamp);
			System.out.println("We have a non-stop flight to NEW YORK! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+us.getSymbol()+nyflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION+"at "+hotelNY+" package? :");
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
					System.out.println(TOTALCOST+us.getSymbol()+((hotelNYprice*days) + nyflight));
					int confirmationno =(int) Math.round(Math.floor(100000 + Math.random() * 900000));
					System.out.println("Confirmation no :"+confirmationno);
					reservations.put(confirmationno, hotelNY);
					System.out.println(reservations);
				}
				else {
					System.out.println(ENJOY);
				}
				break;
			case "CAPETOWN":
			System.out.println("Welkom!!!!");
			System.out.println(LOCALTIME +africa);
			System.out.println("We have a non-stop flight to Capetown! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+us.getSymbol()+ aflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION+"at "+hotela+" package? :");
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
					int confirmationno = (int)Math.round(Math.floor(100000 + Math.random() * 900000)) ;
					System.out.println(TOTALCOST+us.getSymbol()+ ((hotelaprice*days) + aflight));
					System.out.println("Confirmation no :"+confirmationno);
					reservations.put(confirmationno, hotela);
				}
				else {
					System.out.println(ENJOY);
					}
			break;
		case "DUBAI":
			System.out.println("AAAA OOOOOOOO");
			System.out.println(LOCALTIME +dubai);
			System.out.println("We have a non-stop flight to Dubai! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+us.getSymbol()+dflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION+"at "+hoteld+" package? :");
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
					System.out.println(TOTALCOST+us.getSymbol()+ ((hoteldprice*days) + dflight));
					int confirmationno = (int)Math.round(Math.floor(100000 + Math.random() * 900000)) ;
					System.out.println("Confirmation no :"+confirmationno);
					reservations.put(confirmationno, hoteld);
				}
				else {
					System.out.println(ENJOY);
				}
			break;
		case "SHANGHAI":
			System.out.println("Welcome");
			System.out.println(LOCALTIME +china);
			System.out.println("We have a non-stop flight to Shanghai! on "
					+ currentTimestamp.plus(6, ChronoUnit.HOURS)+ " for "+us.getSymbol()+sflight);
			command = Console.getString(BOOK);
			if (command.equalsIgnoreCase("Yes")) {
				System.out.println(CONFIRMATION+"at "+hotels+" package? :");
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
					System.out.println(TOTALCOST+us.getSymbol()+ ((hotelsprice*days) + sflight));
					int confirmationno = (int)Math.round(Math.floor(100000 + Math.random() * 900000)) ;
					System.out.println("Confirmation no :"+confirmationno);
					reservations.put(confirmationno, hoteld);
					
					}
				else {
					System.out.println(ENJOY);
					}
			break;
		}
			break;
			
		case "FIND":	
			if(reservations.size() > 0 ) {
			Set<Integer> keyset = reservations.keySet();
			ArrayList<Integer> listOfConfNo = new ArrayList <Integer>(keyset);
			Collection<String> values = reservations.values();
			ArrayList<String> listOfHotels = new ArrayList <String>(values);
			System.out.println("list of confNos" + listOfConfNo);
			System.out.println("list Of Hotels" + listOfHotels);
			Integer find = Console.getInt("Enter your conf no. :");
			boolean found = false;
			for (int i=0; i < listOfConfNo.size(); i++) {
				if(listOfConfNo.contains(find) && !found) {
					found = true;
				} else {
					System.out.println("No confirmation found. Invalid no.");
				}
				if(found) {
					int position = listOfConfNo.indexOf(find);
					System.out.println("Your confirmating no is "+find +". Your package is booked "+listOfHotels.get(position));
					break;
				}
			}		
			}	
			break;
		case "ALL":
			System.out.println("ConfirmationNo  Package");
			System.out.println("==============  =======");
			for (Map.Entry<Integer, String> entry: reservations.entrySet()) {
				System.out.println(entry.getKey()+"    "+entry.getValue());
			}
			break;
		case "EXIT":
			System.out.println("Bye");
			break;
		}
		}
}
	private static void displayCountries() {
		System.out.println("Cities we provide travel assiatance:");
		System.out.println("==================");
		System.out.println("Newyork");
		System.out.println("Mumbai");
		System.out.println("Capetown");
		System.out.println("Dubai");
		System.out.println("Shanghai");
		System.out.println("Exit");
	}
	private static void displayMenu() {
		System.out.println("Select one option");
		System.out.println("==================");
		System.out.println("Book: ");
		System.out.println("Find: ");
		System.out.println("All: ");
		System.out.println("Exit: ");
		System.out.println("==================");
	}
}
