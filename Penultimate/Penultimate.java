import java.util.Scanner;
public class Penultimate{
	public static void main (String [] args) {
		int counter = 0;
		char empty = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		char[] letters = sc.nextLine().toCharArray();
		for (int x = 0; x <= letters.length -1; x++){
			if (letters[x] == empty){
				counter = x;
			}
		}
		while (letters[counter -1] != empty){
			counter = counter -1;
			System.out.print(letters[counter]);
		}
		
		System.out.println("");
		while (letters[counter] !=empty){
			System.out.print(letters[counter]);
			counter = counter +1;
		}
		
		
	}
}