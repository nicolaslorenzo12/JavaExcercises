import java.util.Scanner;
public class Newstring{
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String newstring = "a";
		String firststring = "b";
		while (firststring.length() <= 2){
			System.out.println("Please enter a string");
			firststring = sc.nextLine();
			if (firststring.length() <= 2){
				System.out.println("###");
			}
		}
		newstring = firststring.substring(0, 3);
		System.out.println(newstring);
	}
}