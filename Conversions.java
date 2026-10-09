// Conversions.java
// Program to practice using math to convert certain units or representations.

import java.util.Scanner; //Importing Scanner

public class Conversions
{
	public static void main(String[] args)
	{
		// toKelvin and printTemperatures tests
		System.out.println("\nTesting toKelvin and printTemperatures: ");
		double f1 = 32.00;
		printTemperatures(f1, toKelvin(f1));

		// TODO: Add at least 5 additional tests

		// printClockTime tests
		System.out.println("\nTesting printClockTime:");
		// Declare a scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input total seconds as an integer");
		
		int val = sc.nextInt();
		printClockTime(val);

		// toSeconds tests
		System.out.println("\nTesting toSeconds:");
		int h1 = 1;
		int m1 = 5;
		int s1 = 1;
		printClockTime(toSeconds(h1, m1, s1)); // Expect: 3901

		// TODO: Add tests and outputs

	}

	// toKelvin
	// Converts a value in Fahrenheit to the corresponding value in Kelvin.
	// f: the temperature in Farenheit
	public static double toKelvin(double f){
		return 5/9 * (f-32) + 273.15;
	}
	
	// printTemperatures
	// Prints the message "<f> F corresponds to <k> K"
	// f: the temperature in Farenheit
	// k: the temperature in Kelvins
	public static void printTemperatures(double f, double k){
		System.out.println(f+" F corresponds to " + k + " K");
	}

	
	// printClockTime
	// Converts from seconds to hour:minutes:seconds, and prints the result to the console.
	// seconds: the time in seconds
	public static void printClockTime(int seconds){
		// one hour = 3600 seconds
		int hours = seconds / 3600;
		// % is the remainder operation so it gives us the remaining seconds after we remove the hours
		int minutes = (seconds % 3600) / 60;
		// % again so we are left with the seconds after we calculated the minutes
		int sec = seconds % 60;
		System.out.println(seconds + " seconds is " + hours + ":" + minutes + ":" +sec);
		
	}
	
	// toSeconds
	// Converts from hours:minutes:seconds to seconds
	public static int toSeconds(int hours, int minutes, int seconds){
		return hours * 3600 + minutes * 60 + seconds;
	}


}
