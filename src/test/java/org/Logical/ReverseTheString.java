package org.Logical;

public class ReverseTheString {
	public static void main(String[] args) {
		String s = "Srinivasu";
		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			System.out.print(charAt);
		}
	}

}
