package ui;

import java.util.ArrayList;
import java.util.List;
import business.Contact;
import interfrace.TestContact;

public class LambdasApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Lambdas");
		
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221,5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All contact:");
		for (Contact c: contacts) {
			System.out.println(c);
		}
		
		System.out.println("=====================");
		System.out.println("contacts no phone - lambda");
//		List<Contact> contactNoPhone = filterContactsNoPhone(contacts);
		List<Contact> contactNoPhone = filterContacts(contacts,
										c -> c.getPhone()==null);
		printContacts(contactNoPhone);
		
		System.out.println("=====================");
		System.out.println("contacts no email - lambda");
		List<Contact> contactNoEmail = filterContacts(contacts,
										c -> c.getEmail()==null);
		printContacts(contactNoEmail);
		
		System.out.println("=====================");
		System.out.println("contacts no email & no phone - lambda");
		List<Contact> contactNoEmailNoPhone = filterContactsNoEmailNoPhone(contacts);
		printContacts(contactNoEmailNoPhone);
		
		
		System.out.println("Bye");

	}
	public static void printContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
	}
	
	
	//	Our Lambdas method
	public static List<Contact> filterContacts(List<Contact> contacts,
										TestContact condition){
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		
		return filteredContacts;
	}
	
	
	
	
	//below methods do not use lambdas
	
	
	public static List<Contact> filterContactsNoPhone(List<Contact> contacts){
		List<Contact> contactsNoPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone()==null) {
				contactsNoPhone.add(c);
			}
		}
		return contactsNoPhone;
	}

	public static List<Contact> filterContactsNoEmail(List<Contact> contacts){
		List<Contact> contactsNoEmail = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getEmail()==null) {
				contactsNoEmail.add(c);
			}
		}
		return contactsNoEmail;
	}
	
	public static List<Contact> filterContactsNoEmailNoPhone(List<Contact> contacts){
		List<Contact> contactsNoEmailNoPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getEmail()==null && c.getPhone()==null) {
				contactsNoEmailNoPhone.add(c);
			}
		}
		return contactsNoEmailNoPhone;
	}
	
	

}
