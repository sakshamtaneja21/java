//Basic class & objects (2-3-2020)

import java.util.*;
class Add{
	int a, b;
	void add(){
		System.out.println("Sum: " + (a+b));
	}
}

class Test25{
	public static void main(String args[]){
		Add obj1 = new Add();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No1:");
		obj1.a = sc.nextInt();
		System.out.print("Enter No2:");
		obj1.b = sc.nextInt();
		obj1.add();
	}
}