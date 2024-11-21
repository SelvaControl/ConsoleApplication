package com.BusReservation;

import java.util.LinkedList;
import java.util.Scanner;

public class BusBooking {
	static final int total_seats = 40;
	static LinkedList<Integer> cars = new LinkedList<Integer>();
	static Scanner scanner = new Scanner(System.in);

	public void viewSeats() {
		System.out.println("\nAvailable Seats:");
		for (int i = 0; i < total_seats; i++) {
			if (!cars.contains(i)) {
				System.out.print((i + 1) + " ");
			}
		}
		System.out.println();
	}

	public void reserveSeat() {
		System.out.print("\nEnter seat number to reserve (1-" + total_seats + "): ");
		int seatNumber = scanner.nextInt();

		if (seatNumber < 1 || seatNumber > total_seats) {
			System.out.println("Invalid seat number. Please try again.");
			return;
		}

		if (cars.contains(seatNumber - 1)) {
			System.out.println("Seat " + seatNumber + " is already reserved.");
		} else {
			cars.add(seatNumber - 1);
			System.out.println("Seat " + seatNumber + " has been successfully reserved.");
		}
	}

	public void cancelReservation() {
		System.out.print("\nEnter seat number to cancel (1-" + total_seats + "): ");
		int seatNumber = scanner.nextInt();

		if (seatNumber < 1 || seatNumber > total_seats) {
			System.out.println("Invalid seat number. Please try again.");
			return;
		}

		if (!cars.contains(seatNumber - 1)) {
			System.out.println("Seat " + seatNumber + " is not reserved.");
		} else {
			cars.remove(Integer.valueOf(seatNumber - 1));
			System.out.println("Reservation for seat " + seatNumber + " has been successfully cancelled.");
		}
	}

	public void busBook() {
		boolean flag = true;

		while (flag) {
			System.err.println("\n1. View Available Seats");
			System.err.println("2. Reserve a Seat");
			System.err.println("3. Cancel a Reservation");
			System.err.println("4. Exit");
			System.err.print("Enter your choice: ");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				viewSeats();
				break;
			case 2:
				reserveSeat();
				break;
			case 3:
				cancelReservation();
				break;
			case 4:
				System.out.println("Thank you!");
				flag = false;
				break;
			default:
				System.out.println("Enter the valid input");
			}
		}
	}
}
