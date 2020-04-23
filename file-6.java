//Largest of 3 Numbers without Logical Operators

import java.util.Scanner;
class Test6{
    public static void main(String args[]){
		int x, y, z;
        System.out.println("Enter 3 numbers: ");
        Scanner sc=new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
		if(x >= y){
			if(x >= z)
				System.out.println("Largest no. is "+x);
			else
				System.out.println("Largest no. is "+z);
		}
		else{
			if(y >= z)
				System.out.println("Largest no. is "+y);
			else
				System.out.println("Largest no. is "+z);
		}
	}
}