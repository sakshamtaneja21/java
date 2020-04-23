//Grade Calculator

import java.util.Scanner;
class Test5{
    public static void main(String args[]){
		int result;
		System.out.println("Enter percentage to get grade: ");
		Scanner sc = new Scanner(System.in);
		result = sc.nextInt();
		switch(result/10){
			case 10 : System.out.println("Grade: A+"); break;
			case 9 : System.out.println("Grade: A");	break;
			case 8 : System.out.println("Grade: B+"); break;
			case 7 : System.out.println("Grade: B"); break;
			case 6 : System.out.println("Grade: C+"); break;
			case 5 : System.out.println("Grade: C"); break;
			case 4 : System.out.println("Grade: E"); break;
			default : System.out.println("Fail!");
		}
	}
}