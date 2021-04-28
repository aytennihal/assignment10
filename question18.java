package Assignment__10;

import java.util.Iterator;
import java.util.Scanner;
public class question18 {

	public static void main(String[] args) {
		
		System.out.println(sentences());
		
	}
		
		public static String sentences() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter your word: ");
		String word = sc.next();
		
		System.out.println("counter: ");
		int count = sc.nextInt();
		
		System.out.println("Enter your separator");
		String sep = sc.next();
		
		
		String newWord = "";
		
		if(count == 1) {
			newWord = word;
		} else if (count > 1) {
			for(int i = 0; i < count; i++) {
				newWord += word + sep;
			}
			
		}
		
		return newWord;
		
	
		
		
	}
}
