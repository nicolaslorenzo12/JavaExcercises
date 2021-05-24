import java.util.Scanner;
public class Binary{
	public static void main (String [] args) {
		long binary1;
		long binary2;
		int i =0;
		int remainder = 0;
		int [] sum = new int [20];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input first binary number: ");
		binary1 = sc.nextLong();
		System.out.print("Input second binary number: ");
		binary2 = sc.nextLong();
		
		while (binary1 != 0 || binary2 != 0){
			sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
			remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		if (remainder != 0){
			sum[i++] = remainder;
		}
		
		--i;
		
		System.out.print("Sum of two binary numbers: ");
		while (i >= 0){
			System.out.print(sum[i--]);
		}
		System.out.print("\n");
	}
}