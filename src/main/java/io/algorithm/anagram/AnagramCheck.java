package io.algorithm.anagram;

public class AnagramCheck {

	public static boolean isAnagram(String word, String anagram) {
		if(word.length() != anagram.length()) {
			return false;
		}

		char[] chars = word.toCharArray();

		for(char c : chars) {
			int index = anagram.indexOf(c);
			System.out.println("index >> " + index);
			System.out.println("c >> " + c);
			if(index != -1) {
				String strFirst = anagram.substring(0,index);
				String strSecond = anagram.substring(index +1, anagram.length());
				System.out.println("first >> " + strFirst);
				System.out.println("second >> " + strSecond);
				anagram = strFirst + strSecond;
				System.out.println("anagram >>> " + anagram);
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}
}
