package ui;

import com.util.Console;

import business.Item;
import db.itemDB;
import interfaces.DAO;
import text.Itemtxtfile;

public class ItemManagerApp {
	private static final String ITEM_NOT_FOUND = "No item found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Item Manager - Text file version");
		System.out.println();
		
		//creating instance of the Itemtextfile should create our file
		// on the first run of this page
		DAO<Item> itemsDAO = new itemDB();
		
		int command = 0;
		while (command != 9) {
			displaymenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch(command) {
			case 1:
			// get all
				System.out.println("Get all items: ");
				for (Item item: itemsDAO.getAll()) {
					System.out.println(item);
				}
				break;
			case 2:
				System.out.println("Get items by id: ");
			// get by id
				int id = Console.getInt("ID: ");
				Item item = itemsDAO.get(id);
				if(item != null) {
					System.out.println("Item Found: "+item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			
			
			case 3:
				System.out.println("Add an item: ");
			//add
				id = Console.getInt("ID: ");
				String desc = Console.getLine("Description: ");
				if (itemsDAO.add(new Item(id, desc))) {
					System.out.println("Item added!");
				}
				else {
					System.out.println("Error adding an item.");
				}
				break;
			case 4:
				System.out.println("Update an item: ");
			//update
				id = Console.getInt("ID: ");
				item = itemsDAO.get(id);
				if(item != null) {
					String newdesc = Console.getLine("New Discription: ");
					item.setDiscription(newdesc);
					itemsDAO.update(item);
					System.out.println("Item updated: ");
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 5:
				System.out.println("Delete an item: ");
			//delete
				id = Console.getInt("ID: ");
				item = itemsDAO.get(id);
				item = itemsDAO.get(id);
				if(item != null) {
					itemsDAO.delete(item);
					System.out.println("Item deleted: "+item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
			case 9:
				System.out.println("Exit the App: ");
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
