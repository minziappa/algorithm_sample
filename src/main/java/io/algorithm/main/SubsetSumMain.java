package io.algorithm.main;

public class SubsetSumMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] set = {3, 34, 4, 12, 5, 2};
		
		// int n = sizeof(set)/sizeof(set[0]);

		// System.out.println(isSubsetSum(set, set, 9));

		//System.out.println(hasSum(array, 56));
		
	}

	public static boolean isSubsetSum(int[] set, int n, int sum) {

		boolean blnResult = false;

		if(sum==0) {return true;}
		if (n == 0 && sum != 0) return false;

		// If last element is greater than sum, then ignore it
		if (set[n-1] > sum) {
			return isSubsetSum(set, n-1, sum);	
		}

		System.out.println("n => " + n);

		return isSubsetSum(set, n-1, sum) || isSubsetSum(set, n-1, sum-set[n-1]);
	}

	 //method based on dynamic programming
	public static boolean hasSum(int [] array, int sum) {
		int len = array.length;

		System.out.println("len is " + len);
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

}