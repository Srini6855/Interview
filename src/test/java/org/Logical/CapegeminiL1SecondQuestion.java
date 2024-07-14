package org.Logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CapegeminiL1SecondQuestion {
	public static void main(String[] args) {
		String s = "SRINIvasu";
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charCount.containsKey(charAt)) {
				charCount.put(charAt, charCount.get(charAt) + 1);
			} else {
				charCount.put(charAt, 1);
			}
		}
		System.out.println(charCount);
		Set<Entry<Character, Integer>> entrySet = charCount.entrySet();
		for (Entry<Character, Integer> b : entrySet) {
			Integer value = b.getValue();
			if (value > 1) {
				System.out.println(b);
			}
		}
	}

}
