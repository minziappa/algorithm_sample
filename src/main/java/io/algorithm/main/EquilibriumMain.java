package io.algorithm.main;

public class EquilibriumMain {

	public static void main(String[] args) {

		int [] arrayA = new int[]{-7, 1, 5, 2, -4, 3, 0};
		// equi(arrayA, 7);
		System.out.println(equi(arrayA, 7));

	}

	public static int equi(int A[], int n) {
		int k, m, lsum, rsum;

		for(k = 0; k < n; ++k) {
			lsum = 0; rsum = 0;
			for(m = 0; m < k; ++m) {
				lsum += A[m];
				System.out.println("first >>" + m);
			}
			for(m=k + 1; m < n; ++m) {
				rsum += A[m];
				System.out.println("second >>" + m);
			}
			if (lsum == rsum) {
				return k;
			}

			System.out.println("------------------------------");

		}

		return -1;
	}

}