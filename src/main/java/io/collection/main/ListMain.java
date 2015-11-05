package io.collection.main;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	/**
	 * 
	 * Protect order
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> listTest = new ArrayList<String>();
		for(int i=0; i< 10000000; i++) {
			listTest.add("aasdfasdfasdfasefsxcwaecaasdfa" + String.valueOf(i));
		}
		System.out.println("0 >> " + listTest.get(0));
		listTest.remove(0);
		System.out.println("1 >> " + listTest.get(0));
		System.out.println("2 >> " + listTest.get(1000000));
		System.out.println("3 >> " + listTest.size());

//		for (String str : listTest) {
//			System.out.println("abcd >> " + str);
//		}
	}

}
