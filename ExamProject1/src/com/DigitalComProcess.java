package com;

import java.util.Scanner;

public class DigitalComProcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Select an option");
		System.out.println("Press 1 to register user");
		System.out.println("Press 2 to view all games");
		System.out.println("Press 3 to search game by author");
		System.out.println("Press 4 to exit");
		while (choice != 4) {
			choice = sc.nextInt();
			while (choice < 1 || choice > 4) {
				System.out.println("Incorrect Input");
				choice = sc.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println("Input userID");
				String userId = sc.next();
				System.out.println("Input Password");
				String password = sc.next();
				User.addUser(userId, password);
				System.out.println(User.users);
				break;
			case 2:
				System.out.println(GameService.viewAll());
				break;
			case 3:
				System.out.println("Input author name");
				String author = sc.next();
				System.out.println(GameService.authorSearch(author));
				break;
			case 4:
				break;
			}
		}
		sc.close();
	}

}
