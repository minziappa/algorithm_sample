package io.algorithm.compress;

public class Compress {

	public String compressBetter(String str) {
		// Check if compression would create a longer string
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}

		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == last) {
				count++;
			} else {
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = i;
			}
		}
		/*
		 * In lines 15 - 16 above, characters are inserted when the
		 * repeated character changes. We need to update the string at
		 * the end of the method as well, since the very last set of
		 * repeated characters wouldn't be set in the compressed string
		 * yet.
		 */
		mystr.append(last).append(count);
		return mystr.toString();
	}
	
	private int countCompression(String str) {
		if (str == null || str.isEmpty()) return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		System.out.println("size >> " + size);
		return size;
	}

	public String compressBad(String str) {
		String mystr = "";
		char last = str.charAt(0);
		int count = 1;
		for (int i=1; i<str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				mystr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
			System.out.println(last);
		}

		return mystr + last + count;
	}

}
