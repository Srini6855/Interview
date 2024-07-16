package org.Logical;

public class SumOfDigits {
	public static void main(String[] args) {
		int a = 12345, sum = 0;
		while (a != 0) {
			int lastDigit = a % 10;
			sum = sum + lastDigit;
			a /= 10;
		}
		System.out.println(sum);
	}

}
