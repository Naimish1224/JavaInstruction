package business;
import java.time.LocalDate;

public class Actor {

	private int id;
	private String firstName, lastName, gender;
	private LocalDate date;

	public Actor() {
		// default constructor
	}

	public Actor(int id, String firstName, String lastName, String gender, LocalDate date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.date = date;
	}
	
	public Actor(String firstName, String lastName, String gender, LocalDate date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", date=" + date + "]";
	}
	
	
	

}