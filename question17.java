package Assignment__10;

import java.util.Scanner;

public class question17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String alphabetUpperCase = alphabet.toUpperCase();
		
		System.out.println("From: ");
		char from = sc.next().charAt(0);
		
		System.out.println("To: ");
		char to = sc.next().charAt(0);
	
		if(Character.isLowerCase(from) && Character.isLowerCase(to)) {
			System.out.println(alphabet.substring(alphabet.indexOf(from), alphabet.indexOf(to)+1)); 
		} else if(Character.isUpperCase(from) && Character.isUpperCase(to)) {
			System.out.println(alphabetUpperCase.substring(alphabetUpperCase.indexOf(from), alphabetUpperCase.indexOf(to)+1)); 
		} else {
			System.out.println("Invalid");
		}
		
		
		
		
		
	}
}
