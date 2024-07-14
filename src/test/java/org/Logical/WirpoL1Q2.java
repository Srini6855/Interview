package org.Logical;

public class WirpoL1Q2 {
	public static void main(String[] args) {
		String s = "Srinivasu is an automation engineer";
		String[] split = s.split(" ");
		String res = "";
		for (int i = 0; i < split.length; i++) {
			char charAt = split[i].charAt((split[i].length()) - 1);
			char lowerCase = Character.toUpperCase(charAt);
			String substring = split[i].substring(0, split[i].length() - 1);
			res = res + substring + lowerCase + " ";
		}
		System.out.println(res);
	}

}
