import java.util.Scanner;
public class Checkword{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String start = "";
		while (start.equals("")){
			System.out.println("Please enter a sentence");
			start = sc.nextLine();
		}
		 System.out.println(start.startsWith("Hello"));
	}
}