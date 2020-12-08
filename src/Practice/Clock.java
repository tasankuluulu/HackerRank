package Practice;

import java.util.Scanner;

public class Clock {
	
	/**
	 * Method to convert hours and minutes into seconds with no connection to the time period
	 * @param hours
	 * @param minutes
	 * @return seconds in form of int
	 */
	public static int timeToSeconds(int hours, int minutes) {
		return hours * 60 * 60 + minutes * 60;
	}
	
	/**
	 * Method to convert time into seconds according to the time period
	 * @param hours
	 * @param minutes
	 * @param timePeriod
	 * @return seconds in form of int
	 */
	public static int convertToSeconds(int hours, int minutes, String timePeriod) {
		int timeInSeconds;
		if (timePeriod.equalsIgnoreCase("am")) {
			if (hours == 12) {
				hours -= 12;
			}
			timeInSeconds = timeToSeconds(hours, minutes);
		} else {
			if (hours != 12) {
				hours += 12;
			}
			timeInSeconds = timeToSeconds(hours, minutes);
		}
		return timeInSeconds;
	}
	
	/**
	 * Method to convert seconds to regular time
	 * @param seconds
	 */
	public static void convertSecondsToRegularTime(int seconds) {
		String timePeriod;
		int hours = seconds / 60 / 60;
		int minutes = seconds / 60 - hours * 60;
		if (hours < 12) {
			timePeriod = "AM";
		} else {
			timePeriod = "PM";
		}
		if (timePeriod.equals("PM") && hours > 12) {
			hours -= 12;
		}
		String newTime;
		if (minutes < 10) {
			newTime = hours + ":0" + minutes + " " + timePeriod;
		} else {
			newTime = hours + ":" + minutes + " " + timePeriod;
		}

		System.out.println(newTime);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/** Storing the given time*/
		String givenTime = scan.nextLine();
		
		/** Storing the minutes needed to add */
		int minutesToAdd = scan.nextInt();
		
		/** Splitting given time into hours, minutes and time period */
		String[] splittedString = givenTime.split("[ :]");
		
		/** Storing hours from the given time*/
		int hours = Integer.parseInt(splittedString[0]);
		
		/** Storing minutes from the given time */
		int minutes = Integer.parseInt(splittedString[1]);
		
		/** Retrieving time period from the given time */
		String timePeriod = splittedString[2];
		
		/** Converting time into seconds */
		int timeInSeconds = convertToSeconds(hours, minutes, timePeriod);
		
		/** Adding minutes needed to add */
		timeInSeconds += minutesToAdd * 60;
		
		/** Converting the result into regular time */
		convertSecondsToRegularTime(timeInSeconds);
	}
}
