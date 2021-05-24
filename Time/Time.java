import java.util.Scanner;
public class Time{
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int seconds;
		System.out.println("Please enter the number of seconds");
		seconds = Integer.parseInt(sc.nextLine());
		int hours = seconds / 3600;
		String hoursAsString = String.format ("%02d" , hours);
		int minutes = (seconds % 3600) / 60;
		String minutesAsString = String.format ("%02d" , minutes);
		int restseconds = seconds % 60;
		String restsecondsAsString = String.format ("%02d" , restseconds);
		System.out.println( hoursAsString + ":" + minutesAsString + ":" + restsecondsAsString);
	}
}