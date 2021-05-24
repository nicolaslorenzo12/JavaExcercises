import java.util.Scanner;
class Compare{
	public void comparenum (int a, int b){
		Scanner sc = new Scanner(System.in);
		char n1[] = new char[0];
		char n2[] = new char[0];
		while((a > 75 || a < 25) || (b > 75 || b < 25)){
			System.out.println("Please enter two numbers between 25 and 75");
			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
		}
		n1 = String.valueOf(a).toCharArray();
		n2 = String.valueOf(b).toCharArray();
		boolean samedigit = false;
		for (int z = 0; z <= n1.length - 1; z++){
			if (samedigit == false){
				if (n1[z] == n2[z]) {
					samedigit = true;
					System.out.println(samedigit);
				}	
			}
		}
		if (samedigit == false){
			System.out.println(samedigit);
		}
	}
}