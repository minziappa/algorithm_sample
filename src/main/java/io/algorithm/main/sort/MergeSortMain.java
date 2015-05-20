package io.algorithm.main.sort;

import io.algorithm.sort.Mergesort;

public class MergeSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] intArray = {2,1,6,5,3,4};

		Mergesort merge = new Mergesort();
		merge.sort(intArray);

		for (int i=0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
