package org.Logical;

public class PrimeOrNot {
	public static void main(String[] args) {
		int a = 19, count = 0;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not a prime");
		}
	}
}
