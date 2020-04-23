//Exponents (24-2-2020)

import java.util.Scanner;
import java.lang.Math;
class Test23{
	public static void main(String args[]){
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1: ");
		x = sc.nextInt();
		System.out.println("Enter No2: ");
		y = sc.nextInt();
		System.out.println(Math.pow(x, y));
	}
}