package io.algorithm.main;

public class DefautMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		
		char[] chs = s.toCharArray();
		char temp = 0;

		for(char ch : chs) {
			temp = chs[chs.length-1];
			System.out.println(temp);
		}

	}

}
