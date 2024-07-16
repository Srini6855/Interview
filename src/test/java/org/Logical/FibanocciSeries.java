package org.Logical;

public class FibanocciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(a + ",");
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}
	}

}
