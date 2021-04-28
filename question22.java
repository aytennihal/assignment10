package Assignment__10;

public class question22 {
	public static void main(String[] args) {
		
		String str = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
		if(str.contains("<html>")) {		
			System.out.println(str.substring(str.indexOf("id=\"") + 4, str.indexOf("\">")));	
		} else {
			System.out.println("Invalid input!");
		}
		
	}
}
