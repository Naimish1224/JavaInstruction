package ui;

import com.util.Console;

import business.Item;
import interfaces.DAO;
import text.Itemtxtfile;

public class ItemManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Item Manager - Text file version");
		System.out.println();
		
		//creating instance of the Itemtextfile should create our file
		// on the first run of this page
		DAO<Item> itemsDAO = new Itemtxtfile();
		
		int command = 0;
		while (command != 9) {
			displaymenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch(command) {
			case 1:
			// get all
				for (Item item: itemsDAO.getAll()) {
					System.out.println(item);
				}
				break;
			case 2:
			// get by id
				break;
			case 3:
			//add
				int id = Console.getInt("ID: ");
				String desc = Console.getLine("Description: ");
				if (itemsDAO.add(new Item(id, desc))) {
					System.out.println("Item added!");
				}
				else {
					System.out.println("Error adding an item.");
				}
				break;
			case 4:
			//update
				break;
			case 5:
			//delete
				break;
			case 9:
			//exit
				break;
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}
	private static void displaymenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("==================");
		System.out.println("1 - Get all items");
		System.out.println("2 - Get an item");
		System.out.println("3 - Add an item");
		System.out.println("4 - Update an item");
		System.out.println("5 - Delete an item");
		System.out.println("9 - Exit");
	}

}
