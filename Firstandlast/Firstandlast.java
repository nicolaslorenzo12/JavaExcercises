import java.util.Scanner;
public class Firstandlast{
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		String b = "";
		System.out.println("Please enter two strings");
		a = sc.nextLine();
		b = sc.nextLine();
		if (a.equals("")){
			a = "#";
		}
		else if (b.equals("")){
			b = "#";
		}
		
		System.out.print(a.substring(0,1) + b.substring(b.length()-1));
	}
}