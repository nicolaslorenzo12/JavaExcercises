import java.util.Scanner;
public class Turnword{
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		char[] letters = sc.nextLine().toCharArray();
		for (int x = letters.length - 1; x >= 0; x--){
			System.out.print(letters[x]);
		}
	}
}