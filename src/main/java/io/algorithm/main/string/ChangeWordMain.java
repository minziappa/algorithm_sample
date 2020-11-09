package io.algorithm.main.string;

public class ChangeWordMain {

	public static void main(String[] args) {

		String s = "abcd";
		char[] chs = s.toCharArray();
		int intLastChar = chs.length-1;

		char temp = 0;
		
		for(int i=0; i < chs.length/2; i++) {
			temp = chs[i];
			chs[i] = chs[intLastChar - i];
			chs[intLastChar - i] = temp;
		}

		System.out.println(chs);
	}

}
