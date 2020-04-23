//Swapping Values using 3rd variable (2-3-2020)

import java.util.*;
class Swap{
	int x, y, tmp;
	void swap(){
		tmp = x;		x = y;		y = tmp;
		System.out.println("After Swapping");
		System.out.println("No1 = " +x);
		System.out.println("No2 = " +y);
	}
}

class Test26{
	public static void main(String args[]){
		Swap obj1 = new Swap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No1: ");
		obj1.x = sc.nextInt();
		System.out.print("Enter No2: ");
		obj1.y = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("No1 = " +obj1.x);
		System.out.println("No2 = " +obj1.y);
		obj1.swap();
	}
}