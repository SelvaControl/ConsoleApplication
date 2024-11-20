package com.BusReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PassangerRegistration {
	static  HashMap<String, String> userDetails = new HashMap<String, String>();
    static Scanner scanner = new Scanner(System.in);
    static BusBooking busdetail = new BusBooking();
    
	  static void userRegistartions() {
					String userRePassword;
					System.out.println("Please enter your userName");
					String userName = scanner.nextLine();
					System.out.println("Please enter your Password");
					String userPassword = scanner.nextLine();
					  do {
		                    System.out.println("Please enter your Password Again");
		                    userRePassword = scanner.nextLine();
		                    System.out.println("userPassword :"+ userPassword);
		                } while (!userRePassword.equals(userPassword));

					
					String statusOfStoring = storedDetails(userName,userPassword);
					
					System.out.println("Your Registrations Completed, Please Login...");	
		  }
	  
	  
	  public static  void usersList() {
			System.out.println(userDetails);
		}
	  
	  
	  public static  void deleteUser() {
		  System.out.println("Please enter your userName");
			String userName = scanner.nextLine();
			if(userDetails.containsValue(userName)) {
				userDetails.remove(userName);
				System.out.println("User Deleted Successfully");
			}else {
				System.out.println("User Not Registered");
				
			}
		}
	  
	  public static  void editUser() {
		  System.out.println("Please enter your userName");
			String userName = scanner.nextLine();
			if(userDetails.containsValue(userName)) {
				System.out.println("Enter your password to Update");
				String userNewpassword = scanner.nextLine();
				storedDetails(userName,userNewpassword);
				System.out.println("Your Registrations Updated Successfully, Please Login...");
				
				
			}else {
				System.out.println("User Not Registered");
				
			}
		}
	  
	  
	  static String storedDetails(String userName, String userPassword) {
		  userDetails.put(userName,userPassword);
	        System.out.println("Current user details: " + userDetails); 
	        return "stored";
	 }
	  
	  public static  void userLogin() {
			System.out.println("Please enter your userName");
			String userName = scanner.nextLine();
			System.out.println("Please enter your password");
			String userPassword = scanner.nextLine();
			if(!userDetails.containsValue(userName) || !userDetails.containsValue(userPassword)) {
				System.out.println("User Not Registered");
			}else {
				System.out.println("Welcome " + userName);
				
				busdetail.busBook();			
				}
			
		}
	  
	  
	
	public static void main (String[] args) {
		
		try {
			boolean flag = true;
			
			do {
				System.err.println("1. Login");
				System.err.println("2. Registration");
				System.err.println("3. Users List");
				System.err.println("4. Edit User");
				System.err.println("5. Delete User");
				
			String	str = scanner.nextLine(); 
				 switch(str){    
				    case "1": 
				    	userLogin();
				    	break;  
				    case "2": 
				    	userRegistartions();  
				    	break;  
				    case "3": 
				    	usersList();  
				    	break;  
				    case "4": 
				    	editUser();   
				    	break;  
				    case "5": 
				    	deleteUser();   
				    	break; 
				    }  
				
			} while(flag);
			
			
	}catch(Exception e) {
		System.out.println(e);
	}	
	}

	
}

