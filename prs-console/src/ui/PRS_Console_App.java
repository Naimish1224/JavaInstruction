package ui;
import com.util.Console;
import java.util.Scanner;
import business.User;
import db.UserDb;
import interfrace.DAO;

public class PRS_Console_App {
	private static final String ITEM_NOT_FOUND = "No Record Found";



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO<User> userDAO = new UserDb();


		int command = 0;
		while (command != 9) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();

			switch (command) {
			
			case 1:
				System.out.println("Get all Users");
				System.out.println("=============================");
				
				for (User user : userDAO.getAll()) {
					System.out.println(user);
				}
				break;
				
			case 2:
				System.out.println("Get User by ID");
				System.out.println("=============================");
				
				int id = Console.getInt("ID: ");
				User user = userDAO.get(id);
				
				if (user != null) {
					System.out.println("User Found: " + user);
					
				} else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
				
			case 3:
				System.out.println("Add User");
				System.out.println("=============================");
				
				String fn = Console.getString("Firstname: ");
				String ln = Console.getString("Lastname: ");
				String un = Console.getString("Username: ");
				String pass = Console.getString("Password (5 digit): ");
				String phone = Console.getString("Phone No: ");
				String email = Console.getString("Email: ");
				boolean rev = Console.getBollean("Reviewer? " , 0, 1);
				
				if (yesno.e0) {}
				Integer admin = Console.getInt("Admin?: Yes/No ");

				if (userDAO.add(new User(fn, ln, un, pass, phone, email, rev, admin))) {
					System.out.println("User added!");
					
				} else {
					System.out.println("Error adding User.");
				}
				break;
				
			
				
			case 5:
				System.out.println("Delete a User");
				System.out.println("=============================");
				
				id = Console.getInt("ID: ");
				user = userDAO.get(id);
				
				if (user != null) {
					userDAO.delete(user);
					System.out.println("User Deleted: " + user);
					
				} else {
					System.out.println(ITEM_NOT_FOUND + id);
				}
				break;
				
			case 6:
				
				break;
			default: 
				System.out.println("Invalid command!  Try again.");
				break;
				
			}
			System.out.println();
		}		

		System.out.println("Bye");
			

		}
	private static void displayMenu() {
		System.out.println("\nCOMMAND MENU:");
		System.out.println("====================");
		System.out.println("1 - Get all users");
		System.out.println("2 - Get a user");
		System.out.println("3 - Add a user");
		System.out.println("4 - Update a user");
		System.out.println("5 - Delete a user");
		System.out.println("----------------------");
		System.out.println("0 - Exit");
		System.out.println();
	}

}
