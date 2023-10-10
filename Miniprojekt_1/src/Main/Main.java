package Main;

import Time.Time;

import java.util.Scanner;

import Date.Date;
import Enum.State;

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		Date date = new Date();

		// start value
		State state = State.TIME;

		Scanner userInput = new Scanner(System.in);

		while (true) {
			switch (state) {
				case TIME -> {
					while (state == State.TIME) {
						displayMenu(state);
						state = userInputTime(userInput, state, time);
					}
				}
				case DATE -> {
					displayMenu(state);
					state = userInputDate(userInput, state, date);
				}
				default -> System.out.println("Wrong input! Try again!");
			}
		}
	}

	private static State userInputTime(Scanner userInput, State state, Time time) {
		switch (userInput.nextLine()) {
			case "1" -> {
				if (state == State.TIME) {
					System.out.println("Input hour of the day (0-23): ");
					int hour = validateUserInput(userInput);
					System.out.println("Input minute of the hour (0-59): ");
					int minutes = validateUserInput(userInput);
					System.out.println("Input second (0-59): ");
					int seconds = validateUserInput(userInput);
					time.setData(hour, minutes, seconds);
				} else {
					System.out.println("Wrong state!");
				}
			}
			case "2" -> {
				if (state == State.TIME) {
					System.out.println(time.getData());
				}
			}
			case "3" -> {
				state = State.DATE;
			}
		}
		return state;
	}

	private static void displayMenu(State state) {
		System.out.printf("""
				1) Set%s
				2) Display %s
				3) Change Mode
				""", state, state);
	}

	private static State userInputDate(Scanner userInput, State state, Date date) {
		switch (userInput.nextLine()) {
			case "1" -> {
				if (state == State.DATE) {
					System.out.println("Input year (YYYY) : ");
					int year = validateUserInput(userInput);
					System.out.println("Input month of year(MM): ");
					int month = validateUserInput(userInput);
					System.out.println("Input day of month (dd): ");
					int day = validateUserInput(userInput);
					date.setData(year, month, day);
				} else {
					System.out.print("Wrong State!");
				}
			}
			case "2" -> {
				if (state == State.DATE) {
					System.out.println(date.getData());
				} else {
					System.out.println("Wrong State!");
				}
			}
			case "3" -> {
				state = State.TIME;
			}
		}
		return state;
	}

	private static int validateUserInput(Scanner scanner) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.out.println("Not a valid input try again");
			}
		}
	}
}
