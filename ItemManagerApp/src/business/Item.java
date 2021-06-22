package business;

public class Item {
	private int id;
	private String discription;
	
	public Item(int id, String discription) {
		super();
		this.id = id;
		this.discription = discription;
	}
	public Item() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", discription=" + discription + "]";
	}
	
	}
	


