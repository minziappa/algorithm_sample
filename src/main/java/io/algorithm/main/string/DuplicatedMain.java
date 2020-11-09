package io.algorithm.main.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatedMain {

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

	public static List<String> removeDuplicatedString1(String[] strArray) {
		List<String> list =  Arrays.asList(strArray);
		List<String> result = new ArrayList<String>(new HashSet<String>(list));		
		return result;
	}

	public static List<String> removeDuplicatedString2(String[] strArray) {

		int lngArray = strArray.length;
		List<String> newList = new ArrayList<String>();
		for(int i=0; i < lngArray; i++) {
			for(int j=i+1; j < lngArray; j++) {
				if(strArray[i].equals(strArray[j])) {
					
				} else {
					if(newList.contains(strArray[i])) {
						System.out.println("Duplicated >>> " + strArray[i]);
					} else {
						System.out.println("Not duplicated >>> " + strArray[i]);
						newList.add(strArray[i]);
					}
				}
			}
		}
		
		return newList;

	}

	/* Best */
	public static List<String> removeDuplicatedString3(String[] strArray) {
		List<String> result = new ArrayList<String>();
		for (String item : strArray) {
			boolean duplicate = false;
			for (String str : result) {
				if (str.equals(item)) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				result.add(item);
			}
		}

		return result;
	}

	public static List<String> removeDuplicatedString4(String[] strArray) {
		
		Collections.sort(Arrays.asList(strArray));
		List<String> result = new ArrayList<String>();
		String prev = null;
		for (String item : strArray) {
			if (!item.equals(prev)) {
				result.add(item);
			}
			prev = item;
		}

		return result;
	}

}