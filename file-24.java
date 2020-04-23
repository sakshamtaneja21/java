//Fibonacci Series (24-2-2020)

import java.util.Scanner;
class Test24{
	public static void main(String args[]){
		int i, n, t1 = 0, t2 = 1, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		System.out.print("First " + n + " terms:");
		for (i = 1; i <= n; ++i){
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			System.out.print(" " + t1);
		}
	}
}