package io.algorithm.main.rotate;

import io.algorithm.rotate.Rotate;

public class RotateMain {
	public static void main(String[] args) {
		int[][] intArray = {
		    { 1,2,3,4 },
		    { 5,6,7,8 },
		    { 9,0,1,2 },
		    { 3,4,5,6 }};
		for (int i=0; i < intArray.length; i++) {
			for (int k=0; k < intArray[0].length; k++) {
				System.out.print(intArray[i][k]);
			}
		System.out.println("");
		}
		System.out.print("================================");
		Rotate ro = new Rotate();
		ro.arrayRotate(intArray, 4);
		for (int i=0; i < intArray.length; i++) {
			for (int k=0; k < intArray[0].length; k++) {
				System.out.print(intArray[i][k]);
			}
		System.out.println("");
		}

	}

}
