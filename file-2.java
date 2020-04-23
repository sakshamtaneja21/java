//Vowel or Consonant

import java.util.Scanner;
class Test2{
	public static void main(String args[]){
		char vowel;
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		vowel = sc.next().charAt(0); //Character Input
		switch(vowel){
			case 'a' : System.out.println("Vowel"); break;
			case 'e' : System.out.println("Vowel"); break;
			case 'i' : System.out.println("Vowel"); break;
			case 'o' : System.out.println("Vowel"); break;
			case 'u' : System.out.println("Vowel"); break;
			default : System.out.println("Consonant");
		}
	}
}