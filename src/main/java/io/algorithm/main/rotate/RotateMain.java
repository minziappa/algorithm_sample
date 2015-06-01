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
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[][] intArray = {{1,3},{2,3},{3,3},
//							{1,2},{2,2},{2,3},
//							{1,1},{2,1},{3,1}};
//
//		for (int i=0; i < intArray.length; i++) {
//			for (int k=0; k < intArray[0].length; k++) {
//				System.out.print(intArray[i][k]);
//			}
//			System.out.println("");
//		}
//		Rotate ro = new Rotate();
//		ro.arrayRotate(intArray, 4);
//		
//	}

}
