package day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 153;
		System.out.println(isArmstrongNumber(a));
	}
	
	public static boolean isArmstrongNumber(int originalNumber) {
		int sum = 0;
		int temp = originalNumber;
		while(temp>0) {
			int remainder = temp%10;
			temp = temp/10;
			sum += Math.pow(remainder, 3);
		}
		if(sum==originalNumber) return true;
		return false;
	}

}
