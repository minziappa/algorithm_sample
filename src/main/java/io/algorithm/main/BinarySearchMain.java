package io.algorithm.main;

public class BinarySearchMain {

	public static void main(String[] args) {

		int[] intArray = new int[] {1,2,3,4,5,6,7};
		System.out.println(searchItem(intArray, 0));
	}
	
	public static boolean searchItem(int[] array, int target) {

		if(array.length < 1) {
			return false;
		}

		int low = 0;
		int high = array.length - 1;

		while(low <= high) {
			int middle = (low + high)/2;

			if(target > array[middle]) {
				low = middle + 1;
			} else if(target < array[middle]) {
				high = middle -1;
			} else {
				return true;
			}
		}

		return false;
	}

}
