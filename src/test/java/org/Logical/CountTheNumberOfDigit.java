package org.Logical;

public class CountTheNumberOfDigit {
	public static void main(String[] args) {
		int a = 123456, count = 0;
		while (a != 0) {
			a /= 10;
			count++;

		}
		System.out.println(count);
	}

}
