package io.algorithm.main.array;

public class SecondArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [][] arrayOne = { {1,2,3}, {4,5,6}, {7,8,9} };
		int [][] arrayTwo = new int [3][3];
		for(int i=0; arrayOne.length > i; i++) {
			for(int k=0; arrayOne[i].length > k; k++) {
				System.out.print(arrayOne[i][k]);
				arrayTwo[k][i] = arrayOne[i][k];
				if(arrayOne[i].length != k + 1) {
					System.out.print(",");
				}
			}
			System.out.println("");
		}

		System.out.println("=======================");
		
		for(int i=0; arrayOne.length > i; i++) {
			for(int k=0; arrayTwo[i].length > k; k++) {
				System.out.print(arrayTwo[i][k]);
				if(arrayTwo[i].length != k + 1) {
					System.out.print(",");
				}
			}
			System.out.println("");
		}

	}

}