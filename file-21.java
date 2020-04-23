//No. of Digits (24-2-2020)

import java.util.Scanner;
class Test21{
	public static void main(String args[]){
		int n, count=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n != 0){
			n /= 10;
			++count;
		}
		System.out.println("Number of digits: " +count);
	}
}