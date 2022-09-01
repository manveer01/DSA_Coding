package day1;

public class FindSubstring {

	public static void main(String[] args) {
		String str = "Tabish is a grea mentor";
		String pattern = "tor";
		int index = findSubstring(str, pattern);
		if(index==-1) {
			System.out.println("Pattern not found");
		}else {
			System.out.println("Pattern found at index = "+index);
		}
	}
	
	static int findSubstring(String str, String pattern) {
		if(str.isEmpty()||str==null||pattern.isEmpty()||pattern==null || str.length()<pattern.length()) {
			return -1;
		}
		int patternLen = pattern.length()-1;
		int count=0;
		int startIndex = -1;
		boolean flag = true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==pattern.charAt(count)) {
				count++;
				if(flag) {
					flag = false;
					startIndex = i;
				}
				if(patternLen==count) return startIndex;
			}
			else {
				count = 0;
				flag=true;
				startIndex = -1;
			}
		}
		return startIndex;
	}

}
