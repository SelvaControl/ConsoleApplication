package com.BusReservation;

import java.util.HashMap;
import java.util.Scanner;

public class BusBooking {
	static  HashMap<String, String> userDetails = new HashMap<String, String>();
	 static Scanner scanner = new Scanner(System.in);
	 
	 public void travelPlaces() {
		 
		 
	 }
	 
	 	public void busDetails() {
		 
	 }
	 	public void bookBus() {
	 
}


	public void busBook() {
		System.err.println("1. Travel Places");
		System.err.println("2. Bus Details");
		System.err.println("3. Book Bus");
		String	str = scanner.nextLine(); 
		 switch(str){    
		    case "1": 
		    	travelPlaces();
		    	break;  
		    case "2": 
		    	busDetails();  
		    	break;  
		    case "3": 
		    	bookBus();  
		    	break;  
		    	default:System.out.println("Enter the valid input");
		    }  
		
	}
	
}
