//Largest of 4 Numbers without Logical Operators

import java.util.Scanner;
class Test7{
    public static void main(String args[]){
		int a,b,c,d;
		System.out.println("Enter 4 numbers: ");
		Scanner sc = new Scanner(System.in);
        a = sc.nextInt();		b = sc.nextInt();
        c = sc.nextInt();		d = sc.nextInt();
        if(a > b){
			if(a > c){
				if(a > d)
					System.out.println("Largest no. is "+a);
                else
					System.out.println("Largest no. is "+d);
			}
		}
        else if(b > c){
			if(b > d)
				System.out.println("Largest no. is "+b);
			else
				System.out.println("Largest no. is "+d);
		}
        else if(c > d)
			System.out.println("Largest no. is "+c);
		else
            System.out.println("Largest no. is "+d);
    }
}