package io.algorithm.main.sort;

import io.algorithm.sort.HeapSort;

public class HeapSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a1={4,1,3,2,16,9,10,14,8,7};
        HeapSort.sort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i] + " ");
        }

	}

}
