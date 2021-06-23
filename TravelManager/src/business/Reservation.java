package business;

public class Reservation {
private String confm;
private String hotel;
private String flight;
public Reservation(String confm, String hotel, String flight) {
	super();
	this.confm = confm;
	this.hotel = hotel;
	this.flight = flight;
}
public String getConfm() {
	return confm;
}
public void setConfm(String confm) {
	this.confm = confm;
	
}
public String getHotel() {
	return hotel;
}
public void setHotel(String hotel) {
	this.hotel = hotel;
}
public String getFlight() {
	return flight;
}
public void setFlight(String flight) {
	this.flight = flight;
}


public Reservation() {
	super();
}
public Reservation(long confno, String hotelm, String flightm) {
	// TODO Auto-generated constructor stub
}


}
