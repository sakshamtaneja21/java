//Sum of Numbers upto n (24-2-2020)

import java.util.Scanner;
class Test17{
	public static void main(String args[]){
		int i, n, sum=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i <= n; i++){
			sum = sum + i;
		}
		System.out.println("Sum of " + n +" numbers from 1: " +sum);
	}
}