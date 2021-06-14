package ui;

import Business.Item;

public class Student {
private String fname;
private String lname;
private int score;
public String getFname() {
	return fname;
}

Student s1 = new Student("Mike", "Murach", 99);
Student s2 = new Student("Joel", "Murach", 87);
Student s3 = new Student("Anne", "Boehm", 93);

public void setFname(String fname) {
	
	
	
	this.fname = fname;
}
public String getLname() {
	
	return lname;
}
public void setLname(String lname) {
	
	this.lname = lname;
}
public int getScore() {
	return score;
}
public void setScore(int score) {

	this.score = score;
}
public Student(String fname, String lname, int score) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.score = score;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [fname=" + fname + ", lname=" + lname + ", score=" + score + "]";
}


}
