package day1;

public class FindSubstring {

	public static void main(String[] args) {
		String str = "Tabish is a grea mentor";
		String pattern = "great";
		int index = findSubstring(str, pattern);
		if(index==-1) {
			System.out.println("Pattern not found");
		}else {
			System.out.println("Pattern found at index = "+index);
		}
	}
	
	static int findSubstring(String str, String pattern) {
		
		return str.indexOf(pattern);
	}

}
