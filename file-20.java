//Table of a Number (17-2-2020)

import java.util.Scanner;
class Test20{
	public static void main(String args[]){
		int i, n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i <= 10; i++){
			System.out.println(n*i);
		}
	}
}