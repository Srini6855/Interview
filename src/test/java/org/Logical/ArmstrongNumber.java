package org.Logical;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a = 153, arms = 0;
		while (a != 0) {
			int lastDigit = a % 10;
			arms = arms + (lastDigit * lastDigit * lastDigit);
			a /= 10;
		}
		System.out.println(arms);
	}

}
