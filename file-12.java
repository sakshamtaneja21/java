//Prime or Not Prime

import java.util.Scanner;
class Test12{
	public static void main(String args[]){
		int n;
		boolean flag = false;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 2; i <= n/2; i++){
			if(n%i == 0){
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println("Not Prime");
		else
			System.out.println("Prime Number");
	}
}