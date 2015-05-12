package io.question;

public class RotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intArray = {{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0; i< intArray.length; i++) {
			int[] oneArray = intArray[i];
			for(int k=0; k< oneArray.length; k++) {
				int aaa = oneArray[k];
				System.out.print(aaa);
			}
			System.out.println("");;
		}

		int [][] scores = new int[4][5];

	}

}