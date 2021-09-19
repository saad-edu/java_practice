package java_practice;

public class Lcm {

	public static void main(String[] args) {
		int a = 0, b = 15;
		System.out.println(getLcm(a, b));
		
	}
	
	public static int getLcm(int a, int b) {
		int gcd = 1;
		for(int i = 1; i<=a && i<=b; i++) {
			if (a%i==0 && b%i==0) {
				gcd = i;	
			}
		}
		
		int lcm = a*b/gcd;
		return lcm;
//		System.out.printf("lcm of %d and %d is %d", a,b,lcm);
	}

}
