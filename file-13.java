//Factorial of a Number (17-2-2020)

import java.util.Scanner;
class Test13{
	public static void main(String args[]){
		int n, i, f = 1;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 1; i <= n; i++){
			f = f * i;
		}
		System.out.println("The factorial is "+f);
	}
}