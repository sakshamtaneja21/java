//Armstrong Number or Not

import java.util.Scanner;
class Test16{
	public static void main(String args[]){
		int n, num, tmp, total = 0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		num = n;
		while(num != 0){
			tmp = num%10;
			total = total + tmp * tmp * tmp;
			num = num/10;
		}
		if(total == n)
			System.out.println("An Armstrong number");
		else
			System.out.println("Not an Armstrong number");
	}
}