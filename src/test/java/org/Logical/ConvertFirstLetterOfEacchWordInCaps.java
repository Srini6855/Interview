package org.Logical;

public class ConvertFirstLetterOfEacchWordInCaps {
	public static void main(String[] args) {
		String s = "Srinivasu is an Automation engineer", res = "";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			char charAt = split[i].charAt(0);
			char upperCase = Character.toUpperCase(charAt);
			res = res + upperCase + split[i].substring(1) + " ";

		}
		System.out.println(res);
	}

}
