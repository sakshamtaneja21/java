//Positive or Negative

import java.util.Scanner;
class Test9{
    public static void main(String args[]){
        int n;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        if(n==0)
			System.out.println("The no. is Zero.");
		else if(n >= 1)
			System.out.println("The no. is Positive(+ve).");
		else
			System.out.println("The no. is Negative(-ve).");
    }
}