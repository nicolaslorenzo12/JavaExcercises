import java.util.Scanner;
public class Thirdword{
	public static void main (String [] args) {
		int counter = 0;
		int wordposition = 0;
		char empty = ' ';
		Scanner sc = new Scanner(System.in);
		char paragraph[] = new char[0];
		while (counter <= 1){
			System.out.println("You have to enter at least three words");
			paragraph = sc.nextLine().toCharArray();
			for (int x = 0; x <= paragraph.length - 1; x ++){
				if (paragraph[x] == empty){
					counter = counter + 1;
					if (counter == 2){
						wordposition = x;
						System.out.println(wordposition);
					}
				}
			
			}	
		}
		if (counter == 2){
			for (int x = wordposition + 1; x <= paragraph.length -1 ; x++){
				System.out.print(paragraph[x]);
			}
		}
		else {
			while (paragraph[wordposition + 1] != ' '){
				System.out.print(paragraph[wordposition + 1]);
				wordposition = wordposition +1;
			}
		}
		
	}
}