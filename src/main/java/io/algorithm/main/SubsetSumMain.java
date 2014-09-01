package io.algorithm.main;

public class SubsetSumMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {10, 34, 19, 27, 58, 45};
		System.out.println(hasSum(array, 56));
	}

	 //method based on dynamic programming
	public static boolean hasSum(int [] array, int sum) {
		int len = array.length;
		System.out.println("");
		boolean[][] table = new boolean[sum+1][len+1];
		int i;
		//If sum is zero; empty subset always has a sum 0; hence true
		for( i = 0; i <= len; i++ ) {
			table[0][i] = true;
		}

		//If set is empty; no way to find the subset with non zero sum; hence false
		for( i = 1; i <= sum; i++ ) {
			table[i][0] = false;
		}

		//calculate the table entries in terms of previous values
		for( i = 1; i <= sum; i++ ) {
			for( int j = 1; j <= len; j++ ) {
				table[i][j] = table[i][j-1];
				if( !table[i][j] && i >= array[j-1] ) {					
					table[i][j] = table[i-array[j-1]][j-1];
				}
			}
		}

		return table[sum][len];
	}

	public static boolean hasSum(int[] array, int start, int sum) {

		boolean blnResult = false;

		if(sum==0) {return true;}
		System.out.println("array.length => " + array.length);
		if(start > array.length-1) {
			System.out.println("start > array.length-1");
			return false;
		}

		if(hasSum(array, start+1, sum) || hasSum(array, start+1, sum-array[start])) {
			blnResult = true;
		}

		return blnResult;
	}

}