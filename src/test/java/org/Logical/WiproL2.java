package org.Logical;

public class WiproL2 {
	public static void main(String[] args) {
		String s = "Having an experience at Java automation";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = 0; j < split.length; j++) {
				char a = split[i].charAt(split[i].length() - 1);
				char b = split[j].charAt(split[j].length() - 1);
				if (a < b) {
					String temp = split[i];
					split[i] = split[j];
					split[j] = temp;
				}
			}
		}
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+" ");
		}

	}

}
