package org.Logical;

import java.util.HashMap;
import java.util.Map;

public class StringOcuurance {
	public static void main(String[] args) {
		String s = "asdftghjhgfdsa swedfghjhgf";
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);
	}

}
