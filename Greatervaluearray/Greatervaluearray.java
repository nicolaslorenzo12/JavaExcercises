import java.util.Scanner;
public class Greatervaluearray{
	public static void main (String [] args){
		int z = 0;
		int [] myarray = {10, 20, 30, 70, 60, 50,180, 67, 43};
		for (int x = 0; x <= myarray.length -1; x ++){
			if (myarray[x] > z){
				z = myarray[x];
			}
		}
		System.out.println("The greater number is " + z);
	}
}