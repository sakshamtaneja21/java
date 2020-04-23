//Leap Year Checker

import java.util.Scanner;
class Test10{
	public static void main(String args[]){
		int n;
		System.out.println("Enter a year: ");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		if(n%100 == 0){
			if(n%400 == 0)
				System.out.println("Leap Year.");
			else
				System.out.println("Not a leap year.");
		}
		else{
			if(n%4 == 0)
				System.out.println("Leap Year.");
			else
				System.out.println("Not a leap year.");
		}
	}
}