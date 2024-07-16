package org.Logical;

public class FactorialNumber {
	public static void main(String[] args) {
		int a = 5, fact = 1;
		while (a != 0) {
			fact = fact * a;
			a--;
		}
		System.out.println(fact);
	}

}
