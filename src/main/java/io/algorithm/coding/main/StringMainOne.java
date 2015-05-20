package io.algorithm.coding.main;

public class StringMainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc d e";
		char[] arr = new char[str.length() + 3*2+1];
		for(int i=0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		// replaceSpaces(arr, str.length());
		String result = replaceSpaces2(str.toCharArray(), str.length());
		for(char c: result.toCharArray()) {
			System.out.print(c);
		}
	}

	public static String replaceSpaces2(char[] str, int length) {
		StringBuffer sb = new StringBuffer();
		for(char c: str) {
			if(c == ' ') {
				sb.append("%20");
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void replaceSpaces(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for(i=0; i<length; i++) {
			if(str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = length + spaceCount * 2;
		System.out.println("newLength >>" + newLength);
		str[newLength] = '\0';
		for(i = length - 1; i >= 0; i--) {
			if(str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength -1;
			}
		}
	}
}
