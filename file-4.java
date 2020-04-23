//Arithmetic Operations

import java.util.Scanner;
class Test4{
	public static void main(String args[]){
		int x, y, choice = 1;
		System.out.println ("Enter 2 numbers: ");
		Scanner sc = new Scanner (System.in);
		x = sc.nextInt();		y = sc.nextInt();
		while(choice != 5 && choice > 0){
			System.out.println ("Enter 1 to Add");
			System.out.println ("Enter 2 to Subtract");
			System.out.println ("Enter 3 to Multiply");
			System.out.println ("Enter 4 to Divide");
			System.out.println ("Enter 5 to Exit");
			System.out.println ("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice){
				case 1 : System.out.println("Sum is " +(x+y)); break;
				case 2 : System.out.println("Difference is " +(x-y)); break;
				case 3 : System.out.println("Product is " +(x*y)); break;
				case 4 : System.out.println("Quotient is " +(x/y)); break;
				case 5 : System.out.println("Exiting..."); break;
				default : System.out.println("Invalid Choice");
			}
		}
	}
}