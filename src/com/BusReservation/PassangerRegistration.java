package com.BusReservation;

import java.util.HashMap;
import java.util.Scanner;

public class PassangerRegistration {
	static HashMap<String, String> userDetails = new HashMap<>();
	static Scanner scanner = new Scanner(System.in);
	static BusBooking busdetail = new BusBooking();

	static void userRegistartions() {
		String userRePassword;
		System.out.println("Please enter your username:");
		String userName = scanner.nextLine();
		System.out.println("Please enter your password:");
		String userPassword = scanner.nextLine();

		do {
			System.out.println("Please confirm your password:");
			userRePassword = scanner.nextLine();
		} while (!userRePassword.equals(userPassword));

		storedDetails(userName, userPassword);
		System.out.println("Registration completed successfully! Please log in.");
	}

	public static void usersList() {
		System.out.println("\nRegistered Users:");
		userDetails.forEach((username, password) -> System.out.println(" - " + username));
	}

	public static void deleteUser() {
		System.out.println("Please enter the username to delete:");
		String userName = scanner.nextLine();
		if (userDetails.containsKey(userName)) {
			userDetails.remove(userName);
			System.out.println("User deleted successfully.");
		} else {
			System.out.println("User not found.");
		}
	}

	public static void editUser() {
		System.out.println("Please enter your username:");
		String userName = scanner.nextLine();
		if (userDetails.containsKey(userName)) {
			System.out.println("Enter your new password:");
			String userNewPassword = scanner.nextLine();
			storedDetails(userName, userNewPassword);
			System.out.println("Your registration has been updated successfully.");
		} else {
			System.out.println("User not found.");
		}
	}

	static void storedDetails(String userName, String userPassword) {
		userDetails.put(userName, userPassword);
	}

	public static void userLogin() {
		System.out.println("Please enter your username:");
		String userName = scanner.nextLine();
		System.out.println("Please enter your password:");
		String userPassword = scanner.nextLine();

		if (userDetails.containsKey(userName) && userDetails.get(userName).equals(userPassword)) {
			System.out.println("Welcome, " + userName + "!");
			busdetail.busBook();
		} else {
			System.out.println("Invalid username or password. Please try again.");
		}
	}

	public static void main(String[] args) {
		boolean flag = true;

		do {
			System.err.println("\n--- Bus Reservation System ---");
			System.err.println("1. Login");
			System.err.println("2. Registration");
			System.err.println("3. Users List");
			System.err.println("4. Edit User");
			System.err.println("5. Delete User");
			System.err.println("6. Exit");
			System.err.print("Enter your input: ");

			String choice = scanner.nextLine();
			switch (choice) {
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
			case "6":
				System.out.println("Goodbye!");
				flag = false;
				break;
			default:
				System.out.println("Enter the valid input");
			}
		} while (flag);
	}
}
