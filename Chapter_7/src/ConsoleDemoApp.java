public class ConsoleDemoApp {
	
	public static void main(String[] args) {
		
		int id = Console.getInt("Id: ");
		String Title = Console.getString("Movie Title: ");
		int Year  = Console.getInt("Year: ");
		String Rating = Console.getString("Rating: ");
		String Director = Console.getString("Director: ");
		
		Movie m1 = new Movie(id, Title, Year, Rating, Director);
		
		
		System.out.println("Movie Summary:");
		System.out.println(m1);
		
}
}