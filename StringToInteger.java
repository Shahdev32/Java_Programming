public class StringToInteger { 

	public static Integer convertStringToInteger(String str) { 
		Integer res = 0; 
		
		for (int i = 0; i < str.length(); i++) { 
			// Multiply the given result by 10 so that it will shift it by one position on left 
			res = res * 10; 
			
			// Convert the current character to Integer and then add it to the previous result 
			res += (s.charAt(i) - '0'); 
		} 
		
		return res; 
	} 
	
	public static void main(String[] args) { 
		String inp1 = "213456"; 
		System.out.println( convertStringToInteger(inp1)); 
		
	} 
} 
