//Voting Eligibility

import java.util.Scanner;
class Test11{
    public static void main(String args[]){
        int x;
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        x = sc.nextInt();
        if(x >= 18)
			System.out.println("You are eligible to vote.");
		else
			System.out.println("You are not eligible to vote.");
    }
}