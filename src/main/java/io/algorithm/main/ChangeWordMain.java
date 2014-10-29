package io.algorithm.main;

public class ChangeWordMain {

	public static void main(String[] args) {

		String s = "abcd";
		
		char[] chs = s.toCharArray();
		char temp = 0;
		
		for(int i=0; i < chs.length/2; i++) {
			temp = chs[i];
			chs[i] = chs[(chs.length-1) - i];
			chs[(chs.length-1) - i] = temp;
		}

		System.out.println(chs);
	}

}
