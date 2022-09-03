package day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 29;
		System.out.println(isPrime(a));
	}
	
	//factor wont exceed the half of that number so doing n/2
//	public static boolean isPrime(int num) {
//		if(num<=1) return false;
//		for(int i=2;i<=num/2;i++) {
//			if(num%i==0) return false;
//		}
//		return true;
//	}
	
	
//	100
//    2 * 50 = 100
//    4 *  25 = 100
//    5 * 20 = 100
//    10 * 10 = 100      after the sqrt numbers started repeating so doing till sqrt(n)
//    20  * 5  = 100
//    25 * 4 = 100
//    50 * 2 = 100
	
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
