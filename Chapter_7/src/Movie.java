
public class Movie {
private int Id;
private String Title;
private int Year;
private String Rating;
private String director;
public int getId() {
	return Id;
	
	
}
public Movie(int id, String title, int year, String rating, String director) {
	super();
	Id = id;
	Title = title;
	Year = year;
	Rating = rating;
	this.director = director;
}

public Movie() {
	super();
}
public void setId(int id) {
	Id = id;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public int getYear() {
	return Year;
}
public void setYear(int year) {
	Year = year;
}
public String getRating() {
	return Rating;
}
public void setRating(String rating) {
	Rating = rating;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
@Override
public String toString() {
	return "Movie [Id=" + Id + ", Title=" + Title + ", Year=" + Year + ", Rating=" + Rating + ", director=" + director
			+ "]";
}






}
