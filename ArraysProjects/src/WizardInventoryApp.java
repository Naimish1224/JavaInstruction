
import java.util.*;



public class WizardInventoryApp {
	static List<String> items;
	
	public static void main(String[] args) {
		
		items = new ArrayList<>();
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
		
		System.out.println("Welcome to the wizard inventory app!");
		System.out.println();
		
		String command = "";
		while(!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ");
			switch (command) {
			case "show":
				System.out.println("Show all items: ");
				System.out.println("-----------------");
			break;
			case "grab":
				System.out.println("Add an item: ");
				System.out.println("-----------------");
			break;
			case "edit":
				System.out.println("Edit an item: ");
				System.out.println("-----------------");
			break;
			case "drop":
				System.out.println("Delete an item: ");
				System.out.println("-----------------");
			break;
			case "exit":
				System.out.println("Exit: ");
				System.out.println("-----------------");
			break;
			default:
			System.out.println("Invalid command. Try again.");
			}
			
			
			
		}
		
		
		
		
		
		
		
		System.out.println("Bye");
		

	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("======================");
		System.out.println("show - show all items");
		System.out.println("grab - grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - delete an item");
		System.out.println("exit - exit the app");
		
	}

}
