import java.util.Scanner;
public class Exercise{
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int firstnumber = 0;
		int secondnumber = 0;
		Compare mycompobj = new Compare();
		System.out.println("Please enter two numbers between 25 and 75");
		firstnumber = Integer.parseInt(sc.nextLine());
		secondnumber = Integer.parseInt(sc.nextLine());
		mycompobj.comparenum(firstnumber,secondnumber);
	}
}