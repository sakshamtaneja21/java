//Day of the Week

import java.util.Scanner;
class Test3{
	public static void main(String args[]){		
		System.out.println("Enter a no. b/w 1 & 7: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch(x){
			case 1 : System.out.println("Monday"); break;
			case 2 : System.out.println("Tuesday"); break;
			case 3 : System.out.println("Wednesday"); break;
			case 4 : System.out.println("Thursday"); break;
			case 5 : System.out.println("Friday"); break;
			case 6 : System.out.println("Saturday"); break;
			case 7 : System.out.println("Sunday"); break;
			default : System.out.println("Invalid Input");
		}
	}
}