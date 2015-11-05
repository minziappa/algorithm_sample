package io.question;

import java.util.ArrayList;
import java.util.List;

public class VerticalRepeatMain {

	public static void main(String[] args) {

		String[][] intArray = {{"a","b","c","T","F","T","F","T","F"},
							{"k","k0","k1","a1","b1","c1","d2","e1","f3"},
							{"k","k0","k2","a2","b1","c2","d2","e2","f3"}};
		String[][] verticalArray = new String[20][20];

		List<List<String>> title2 = new ArrayList<List<String>>();
		List<List<String>> contents2 = new ArrayList<List<String>>();

		boolean oneFlag = true;
		int n = 2;
		for(int i=0; i< intArray.length; i++) {
			int m = 3;
			List<String> title1 = new ArrayList<String>();
			for(int k=0;k< intArray[i].length; k++) {
				// Title
				if(k < 3) {
					System.out.println(intArray[i][k]);
					title1.add(intArray[i][k]);
				}
				if(k > 2) {
					if(k % 2 == 1) {
						do {
							List<String> contents1 = new ArrayList<String>();
							/////
							contents1.addAll(title1);        // abc
							contents1.add(intArray[i][k]);   // T
							contents1.add(intArray[i][k+1]); // F
							/////
							if(i == 0 && oneFlag == true) {
								contents2.add(contents1);
								oneFlag = false;
							} else if (i > 0) {
								contents2.add(contents1);
							}
						} while (intArray[i].length == k);
					}
				}
				m++;
			}
			title2.add(title1);
			n++;
			System.out.println("");
		}

		for(List<String> t2 : title2) {
			for(String t1 : t2) {
				System.out.print(t1);
			}
			System.out.println("");
		}
		System.out.println("------------------------");
		for(List<String> t2 : contents2) {
			for(String t1 : t2) {
				System.out.print(t1);
			}
			System.out.println("");
		}

		System.out.println("========================");
		for(int i=0; i< verticalArray.length; i++) {
			for(int k=0;k< verticalArray[i].length; k++) {
				if(verticalArray[i][k] != null) {
					System.out.print(verticalArray[i][k]);					
				}
			}
			System.out.println("");
		}

	}

	public static void printArray(List<String> list) {
		for(String str : list) {
			System.out.print(str);
		}
		System.out.println("");
	}
}