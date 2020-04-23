//Palindrome or not (17-2-2020)

import java.util.Scanner;
class Test15{
	public static void main(String args[]){
		int sum = 0, r, n, tmp;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		tmp = n; 
		while(n > 0){
			r = n%10;
			sum = (sum * 10) + r; 
			n = n/10;
		}
		if(tmp == sum)
			System.out.println("Palindrome number.");
		else
			System.out.println("Not a Palindrome number.");
	}
}