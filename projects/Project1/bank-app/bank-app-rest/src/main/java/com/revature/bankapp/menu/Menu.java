package com.revature.bankapp.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {

	protected String name;
	protected List<String> menuItems;
	protected int selection;

	public Menu(String name) {

		this.name = name;
		menuItems = new ArrayList<>();

	}

	public void addMenuItem(String menuItem) {

		menuItems.add(menuItem);

	}

	public void displayMenu() {
		System.out.println(name);
		System.out.println("--------------------------------");

		for (int i = 1; i <= menuItems.size(); i++) {
			System.out.println(i + ")" + menuItems.get(i - 1));
		}
		System.out.print("Choose any one of the option you want : ");
	}

	public void captureSelection() {
		Scanner sc = new Scanner(System.in);
		selection = Integer.parseInt(sc.nextLine());
	}

	public void displayMenuAndCaptureSelection() {
		displayMenu();
		boolean validoptionSelectedByUser = false;
		while (!validoptionSelectedByUser) {
			try {
				captureSelection();
				if (selection > 0 && selection <= menuItems.size()) {
					validoptionSelectedByUser = true;
				} else {
					System.out.println("Select Value Between 1 - " + menuItems.size() + "\n");
				}
			} catch (Exception e) {
				System.out.println(e + "\nEnter valid number\n");
			}
		}

		handleAction();
	}

	abstract void handleAction();

}
