package Condition;

/* 4.  Condition ---According to the Gregorian calendar, it was Monday on the date 01/01/1900. If any year is input 
through the keyboard write a program to find out what is the day on 1st January of this year. */


public class DayOfWeekFind {
	
public static void main(String[] args) {
	
    int year = 2024; // You can change this to test other years

    // January 1st, 1900 was a Monday (0 = Monday, 1 = Tuesday, ..., 6 = Sunday)
    int referenceYear = 1900;
    int referenceDay = 0;

    // Calculate the number of days from January 1, 1900, to January 1 of the given year
    int totalDays = 0;

    // Add days for each year from referenceYear to the given year
    for (int i = referenceYear; i < year; i++) {
        totalDays += (isLeapYear(i)) ? 366 : 365;
    }

    // Calculate the day of the week
    int dayOfWeek = (referenceDay + totalDays) % 7;

    // Print the result
    System.out.println("January 1st, " + year + " is a " + getDayName(dayOfWeek));
}

// Method to check if a year is a leap year
	public static boolean isLeapYear(int year) {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            return (year % 400 == 0);
        } else {
            return true;
        }
    } else {
        return false;
    }
}

// Method to get the name of the day of the week
	public static String getDayName(int day) {
    switch (day) {
        case 0: return "Monday";
        case 1: return "Tuesday";
        case 2: return "Wednesday";
        case 3: return "Thursday";
        case 4: return "Friday";
        case 5: return "Saturday";
        case 6: return "Sunday";
        default: return "Invalid day";
    }
	
}

}
