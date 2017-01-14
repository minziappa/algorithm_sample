package io.algorithm.search;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println("test >>> " + getGap1(50));
	}

	public static int getGap(int N) {
		int pre = -1;
		int len = 0;
	 
		while (N > 0) {
			int k = N & -N;
	 
			int curr = (int) Math.log(k);
	 
			N = N & (N - 1);
	 
			if (pre != -1 && Math.abs(curr - pre) > len) {
				len = Math.abs(curr - pre) + 1;
			}
			pre = curr;
		}
	 
		return len;
	}

	public static int getGap1(int n) {

		int max = 0;
		int cnt = 0;
		int t = n;
		boolean firstOne = true;
		
		while (t != 0) {
			if(t%2 == 0) {
				if (!firstOne) {
					cnt =+ 1;
				}
			} else {
				if(max < cnt) {
					max = cnt;
				}
				cnt = 0;
				firstOne = false;
			}
			t = t/2;
		}
		return max;
	}

}