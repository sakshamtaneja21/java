//Patterns

class Test19 {
	public static void main(String args[]){
		int n = 5, px = n, py=n;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j < n*2; j++){
				if(j >= px && j <= py)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
		px--;
		py++;
		System.out.println();
	}
}