package io.test;

public class SplitTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a,b,,,,,,";
		String [] str2 = str.split(",", -1);
		System.out.println(str2.length);
	}

}