package org.Logical;

public class CapegeminiL1 {
	public static void main(String[] args) {
		String s = "1-2-3-4-5";
		String digit = "";
		int characterCount = 0;
		int sumOfFourCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (Character.isDigit(charAt)) {
				digit = digit + charAt;
			} else {
				characterCount++;
			}
		}
		char[] charArray = digit.toCharArray();
		for (int i = 0; i < digit.length(); i++) {
			for (int j = 0; j < digit.length(); j++) {
				int a = Character.getNumericValue(charArray[i]);
				int b = Character.getNumericValue(charArray[j]);
				if (a + b == 4) {
					sumOfFourCount++;
				}
			}
		}
		System.out.println("No of - : " + characterCount);
		System.out.println("No of pairs which lead to output 4 : " + sumOfFourCount);
	}

}
