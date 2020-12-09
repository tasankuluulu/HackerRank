package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Clock {

	/**
	 * Method to convert time into minutes according to the time period
	 * @param hours
	 * @param minutes
	 * @param timePeriod
	 * @return minutes in the form of int
	 */
	public static int ConvertTimeToMinutes(String givenTime) {

		/** Splitting given time into hours, minutes and time period */
		String[] splittedString = givenTime.split("[ :]");

		/** Storing hours from the given time */
		int hours = Integer.parseInt(splittedString[0]);

		/** Storing minutes from the given time */
		int minutes = Integer.parseInt(splittedString[1]);

		/** Retrieving time period from the given time */
		String timePeriod = splittedString[2];

		/** Calculates the minutes according to the time period */
		if (timePeriod.equalsIgnoreCase("am")) {
			if (hours == 12) {
				hours -= 12;
			}
			return hours * 60 + minutes;
		} else {
			if (hours != 12) {
				hours += 12;
			}
			return hours * 60 + minutes;
		}
	}

	/**
	 * Method to convert minutes to regular time and return it a String
	 * @param minutes
	 */
	public static String ConvertMinutesToRegularTime(int minutes) {
		String timePeriod;

		/** Calculates new hours */
		int nHours = minutes / 60;

		/** Calculates new minutes */
		int nMinutes = minutes - nHours * 60;

		/** Clarifies the time period */
		if (nHours < 12) {
			timePeriod = "AM";
		} else {
			timePeriod = "PM";
		}
		if (timePeriod.equals("PM") && nHours > 12) {
			nHours -= 12;
		}

		/** Checks if the time format correct HH:MM */
		if (nMinutes < 10) {
			return nHours + ":0" + nMinutes + " " + timePeriod;
		} else {
			return nHours + ":" + nMinutes + " " + timePeriod;
		}
	}

	/**
	 * Method to add given minutes to the given time and return new time as a String
	 * @param givenTime
	 * @param minutesToAdd
	 */
	public static String AddTime(String givenTime, int minutesToAdd) {

		/** Converting time into seconds */
		int timeInMinutes = ConvertTimeToMinutes(givenTime);

		/** Adding minutes needed to add */
		timeInMinutes += minutesToAdd;

		/** Converting the result into regular time */
		return ConvertMinutesToRegularTime(timeInMinutes);
	}

	public static void main(String[] args) {
		/** Creating some examples to test */
		Map<String, Integer> examples = new LinkedHashMap<>();
		examples.put("9:10 AM", 200);
		examples.put("12:35 PM", 25);
		examples.put("1:00 am", 5);
		examples.put("1:25 PM", 45);
		
		/** Looping through test cases and printing the result */
		Set<Entry<String, Integer>> set = examples.entrySet();
		for (Entry<String, Integer> entry : set) {
			String givenTime = entry.getKey();
			int minutesToAdd = entry.getValue();
			String nTime = AddTime(givenTime, minutesToAdd);
			System.out.println(nTime);
		}
	}
}
