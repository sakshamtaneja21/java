//Even or Odd

import java.util.Scanner;
class Test8{
    public static void main(String args[]){
        int x;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        x = sc.nextInt();
        if(x%2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
    }
}