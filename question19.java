package Assignment__10;

public class question19 {
	public static void main(String[] args) {
		

	String str = "javajavjavaaa";
	String myWord ="java";
	
	
	int counter = 0;
	
	for (int i = 0; i < str.length() - ("java".length()-1); i++) {
		
		if(str.substring(i, i+myWord.length()).contains(myWord)) {
			counter++;
		}
		
	}
	
	System.out.println("Count for " + myWord + " is " + counter);
	
}
}