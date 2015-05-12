package io.algorithm.main.anagram;

import io.algorithm.anagram.AnagramCheck;

public class AnagramMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnagramCheck ana = new AnagramCheck();
		String word = "abcd";
		String anagram = "cdab";

		ana.isAnagram(word, anagram);
	}

}