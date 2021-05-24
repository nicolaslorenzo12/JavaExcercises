import java.util.Scanner;
public class Copyintarrays{
	public static void main (String [] args){
		int [] first = {10, 20, 30};
		int [] second = {1, 2, 3};
		int [] third = {first[0], second[2]};
		System.out.println(third [0] + " , " + third[1]);
	}
}