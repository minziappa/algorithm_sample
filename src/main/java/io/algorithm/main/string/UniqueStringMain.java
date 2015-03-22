package io.algorithm.main.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueStringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String data = "a,b,c,d,c,e";

//		char[] chArray = data.toCharArray();		
//		for(char c: chArray) {
//			System.out.println(c);
//		}

		String[] strArray = data.split(",");

		// System.out.println(removeDuplicatedString2(strArray));

		test(strArray);
		
	}

	public static void test(String[] strArray) {
		
		String duplicatedString = "";
		
		for(int i=0; i < strArray.length; i++) {
			for(int k=0; k < strArray.length; k++) {

				if(i==k) {
					continue;
				}
				if(!duplicatedString.contains(strArray[i]) && strArray[i].equals(strArray[k])) {
					duplicatedString = duplicatedString + strArray[i];
					System.out.println("i >> " + strArray[i]);
					System.out.println("k >> " + strArray[k]);
					System.out.println(" ================== ");
				}
			}
		}
		
		System.out.println(duplicatedString);

	}

}