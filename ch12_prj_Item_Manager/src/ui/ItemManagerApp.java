package ui;

import java.util.ArrayList;
import java.util.List;

import business.Console;
import business.Item;


public class ItemManagerApp {
	private static List<Item> items;

	public static void main(String[] args) {
		// initialize items list and add some office items
		items = new ArrayList<>();
		items.add(new Item(1, "Laptop"));
		items.add(new Item(2, "Monitor"));
		items.add(new Item(3, "Mouse"));
		
		// implement CRUD functionality to allow a user to 
		// maintain the list of items:  Create, Read (List, Get by id),
		// Update, and Delete
		
		System.out.println("Welcome to the Item Manager App!");
		System.out.println();
		int command = 0;
		while (command != 5) {
			displayMenu();
			command = Console.getInt("Command: ");
			switch (command) {
			case 1:
				System.out.println("Items:");
				listItems();
				
				break;
			case 2:
				System.out.println("Get an Item:");
				System.out.println("=================");
				if (items.size() < 4) {
					int nbr = Console.getInt("No: ");
					System.out.println(items.get(nbr-1) + " was found.");
				}
				else {
					System.out.println("Item not found!");
				}

				break;
			case 3:
				System.out.println("Add an Item:");
				System.out.println("=================");
				if (items.size() < 5) {
					String name = Console.getString("Name: ");
					int nbr = Console.getInt("No: ");
					items.add(new Item(nbr, name));
					System.out.println(name + " was added.");
//					System.out.println(items);
					}
				else {
					System.out.println("You can't carry anymore items.  Drop something first.");
				}
				break;
			case 4:
				System.out.println("Update an Item:");
				System.out.println("=================");
				int nbr = Console.getInt("No: ");
				
				if (nbr == 1) {
					String name1 = Console.getString( "Updated name: ");
					Item name = Console.setdescription(name1);
					System.out.println(items);
					
					
					
					System.out.println("Item number " + nbr + " was updated.");
				} else {
					System.out.println("Invalid item number.");
				}
				
				
				// update an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				//   that matches the number entered
				// - if item not found, print message
				// - if item found, prompt user for new description
				// - change the item description (hint: use setter)
				//   and display success msg
				System.out.println("Update an Item:");
				System.out.println("=================");
				break;
			case 5:
			
				// delete an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				//   that matches the id entered
				// - if item not found, print message
				// - if item found, delete it and display success msg
				System.out.println("Delete an Item:");
				System.out.println("=================");
				break;
			case 9:
				// exit
				break;
			default:
				System.out.println("Invalid command.  Try again.");
				break;
			}
			System.out.println();
		}
		System.out.println("Bye!");
	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("==================");
		System.out.println("1 - List all items");
		System.out.println("2 - Get an item");
		System.out.println("3 - Add new item");
		System.out.println("4 - Update an item");
		System.out.println("5 - Delete an item");
		System.out.println("9 - Exit");
		System.out.println();
	}
	private static void listItems() {
		System.out.println("Laptop:");
		System.out.println("Monitor");
		System.out.println("Mouse");
		System.out.println();
	}

}
