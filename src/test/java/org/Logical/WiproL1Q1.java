package org.Logical;

public class WiproL1Q1 {
	public static void main(String[] args) {
		String a = "ab2$Z2d3";
		String lowerCase = a.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		String res = "";
		for (int i = 0; i < charArray.length; i++) {

			if (Character.isDigit(charArray[i])) {
				int numericValue = Character.getNumericValue(charArray[i]);
				for (int j = 1; j < numericValue; j++) {
					res = res + charArray[i - 1];
				}
			} else {
				res = res + charArray[i];
			}
		}
		System.out.println(res);

	}

}
