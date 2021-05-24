import java.util.Scanner;
public class Boolean{
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z;
		System.out.println("Please write three numbers");
		x = Integer.parseInt(sc.nextLine());
		y = Integer.parseInt(sc.nextLine());
		z = Integer.parseInt(sc.nextLine());
		System.out.print("The result is: "+sumoftwo(x, y, z));
	}
	
	public static boolean sumoftwo(int p, int q, int r){
         if (q > p && r > q){
			 return true;
		 } 
		 return false;
	}
}