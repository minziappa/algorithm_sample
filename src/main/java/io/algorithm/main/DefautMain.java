package io.algorithm.main;

public class DefautMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		
		char[] chs = s.toCharArray();
		char temp = 0;
		
		for(int i=0; i < chs.length/2; i++) {
			temp = chs[i];
			chs[i] = chs[(chs.length-1) - i];
			chs[(chs.length-1) - i] = temp;
		}

//		for(char ch : chs) {
//			temp = chs[chs.length-1];
//			chs[chs.length-1] = chs[ch];
//			chs[ch] = temp;
//		}

		System.out.println(chs);
	}

}
