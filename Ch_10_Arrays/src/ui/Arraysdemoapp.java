package ui;

import java.util.Arrays;

import Business.Item;

public class Arraysdemoapp {

	public static void main(String[] args) {
	System.out.println("Welcome");
	
	// basic arrays
	// arrays always starts with 0;
	//cannot change the length
	double[] prices = new double[4];
	prices[0] = 11.12;
	prices[1] = 2.35;
	prices[2] = 4.70;
	prices[3] = 20.22;
	
	//compute average price
	double total = 0;
	
	for (int i=0; i<prices.length; i++) {
		total += prices[i];
		System.out.println(": "+prices[i]);
	}
	System.out.println("Price total: "+total);
	System.out.println("Price total: "+total/prices.length);
	
	
	// enhanced loop / foreach loop (when you dont know the positions of indexes)
	System.out.println("enhanced for loop...");
	for (double p: prices) {
		System.out.println(p);
	}
	
	String[] names = {"Nick", "Patel", "Naimish"};
	
	for(String name: names) {
		System.out.println(name);
	}
	
	//an array of items
	Item i1 = new Item(5, "headphones");
	Item i2 = new Item(2, "amplifier");
	Item i3 = new Item(4, "speakers");
	Item i4 = new Item(1, "turntable");
	Item i5 = new Item(3, "microphone");
	
	Item[] items = {i1, i2, i3, i4, i5};
	
	for(Item item: items) {
		System.out.println(item);
	}
	
	// arrays class
	// is 2.35 in prices array, what position(index)
	
	System.out.println(Arrays.binarySearch(prices, 2.35));
	
	//sort an arrays
	for(String n: names) {
		System.out.println(n);
	}
	
	System.out.println("sort the names...");
	Arrays.sort(names);
	
	for(String n: names) {
		System.out.println(n);
	}
	
	
	
	
	
	
	
	System.out.println("Bye");
	

	}

}
