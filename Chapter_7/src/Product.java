
public class Product {
	
	// page 217
	// Pojo (Plain Old Java Object, Business Class, or Java Bean)
	// 1) Create instance variable
	// 2) generate / create constructors
	// 3) create getters or setters
	// 4) optional: to String()
	
	private String code;
	private String description;
	private double price;
	
	
	// default or empty constructor
	public Product() {
	// by default java sets primitive numeric types to 0 and string types to null
	}

	// fully loaded constructor
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	

}
