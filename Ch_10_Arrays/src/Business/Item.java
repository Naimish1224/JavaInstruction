package Business;

public class Item {
private int number;
private String description;

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Item(int number, String description) {
	super();
	this.number = number;
	this.description = description;
}

public Item() {
	super();
}

@Override
public String toString() {
	return "Item [number=" + number + ", description=" + description + "]";
}

}
