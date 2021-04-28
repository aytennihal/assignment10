package Assignment__10;

public class question23 {
public static void main(String[] args) {
	
	String str = "zbreadbutterbread";
	
	int firstHalf = str.indexOf("bread"); // 1
	int lastHalf = str.lastIndexOf("bread"); // 12
	
	if(firstHalf != lastHalf) {
		System.out.println(str.substring(firstHalf + "bread".length(), lastHalf));
	} else {
		System.out.println("nothing");
	}
	
	
	
	
}
}
