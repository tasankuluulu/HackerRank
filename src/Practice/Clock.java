package Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Clock {

	/**
	 * Method to convert hours and minutes into seconds with no connection to the
	 * time period
	 * 
	 * @param hours
	 * @param minutes
	 * @return seconds in form of int
	 */
	public static int CalculateSeconds(int hours, int minutes) {
		return hours * 60 * 60 + minutes * 60;
	}

	/**
	 * Method to convert time into seconds according to the time period
	 * 
	 * @param hours
	 * @param minutes
	 * @param timePeriod
	 * @return seconds in form of int
	 */
	public static int ConvertTimeToSeconds(String givenTime) {

		/** Splitting given time into hours, minutes and time period */
		String[] splittedString = givenTime.split("[ :]");

		/** Storing hours from the given time */
		int hours = Integer.parseInt(splittedString[0]);

		/** Storing minutes from the given time */
		int minutes = Integer.parseInt(splittedString[1]);

		/** Retrieving time period from the given time */
		String timePeriod = splittedString[2];

		int timeInSeconds;
		if (timePeriod.equalsIgnoreCase("am")) {
			if (hours == 12) {
				hours -= 12;
			}
			timeInSeconds = CalculateSeconds(hours, minutes);
		} else {
			if (hours != 12) {
				hours += 12;
			}
			timeInSeconds = CalculateSeconds(hours, minutes);
		}
		return timeInSeconds;
	}

	/**
	 * Method to convert seconds to regular time
	 * 
	 * @param seconds
	 */
	public static void ConvertSecondsToRegularTime(int seconds) {
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
	
	/** 
	 * Method to add given minutes to the given time and print new time
	 * @param givenTime
	 * @param minutesToAdd
	 */
	public static void AddTime(String givenTime, int minutesToAdd) {
		
		/** Converting time into seconds */
		int timeInSeconds = ConvertTimeToSeconds(givenTime);

		/** Adding minutes needed to add */
		timeInSeconds += minutesToAdd * 60;

		/** Converting the result into regular time */
		ConvertSecondsToRegularTime(timeInSeconds);
	}

	public static void main(String[] args) {
		/** Creating some examples to test */
		Map<String, Integer> examples = new LinkedHashMap<>();
		examples.put("9:10 AM", 200);
		examples.put("12:35 PM", 25);
		examples.put("1:00 am", 5);
		examples.put("1:25 PM", 45);

		String givenTime = null;
		int minutesToAdd = 0;
		
		
		Set<Entry<String, Integer>> set = examples.entrySet();
		for (Entry<String, Integer> entry : set) {
			givenTime = entry.getKey();
			minutesToAdd = entry.getValue();
			AddTime(givenTime, minutesToAdd);
		}

	}
}
