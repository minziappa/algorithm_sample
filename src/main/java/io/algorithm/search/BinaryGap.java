package io.algorithm.search;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println("test >>> " + getGap(5));
	}

	public static int getGap(int num) {
		// Convert number to Binary
		String strNumBinary = Integer.toBinaryString(num);
		System.out.println(strNumBinary);

		// Start While
		
			// First 1 is 
			// Find 0 next to 1 or if 1, check point 1
				// Count 0 to result
			// Close check point after find the other 1 and start check point 1 for next case.

		// Close While
		char charZeno = '0';
		int cntZero = 0;
		int cntFinal = 0;
		for(char ch : strNumBinary.toCharArray()) {
			System.out.println("ch=" + ch);
			if(ch == charZeno) {
				cntZero = cntZero + 1;
			}
			if(cntFinal < cntZero) {
				cntFinal = cntZero;
			}

		}

		return cntFinal;
	}
}