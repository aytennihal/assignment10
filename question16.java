package Assignment__10;

public class question16 {
	
	public static void main(String[] args) {
		

	String str = "xjava";
	
	boolean flag = true;
	
	if(str.length() >= 4) {
		for(int i=0; i<2; i++) {		
			if(str.substring(i, i+4).equals("java")) {
				flag = true;
				break;			
			}else {	
				flag= false;	
			}
		}
		System.out.println(flag);
	} else {
		System.out.println("str length is not greater than or equal to 4");
	}
    
}
}