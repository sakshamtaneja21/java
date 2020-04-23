//Reverse a number (17-2-2020)

import java.util.Scanner;
class Test14{
	public static void main(String args[]){
		int n, rev = 0;
		System.out.println("Enter an number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n != 0){
			int rem = n%10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println("Reversed Number: " +rev);
	}
}