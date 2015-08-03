package io.question;

public class ChangeHorizontalMain {

	public static void main(String[] args) {

		int[][] intArray = {{1,2,3},
							{4,5,6},
							{7,8,9}};
		int[][] verticalArray = new int[intArray.length][intArray[0].length];

		for(int i=0; i< intArray.length; i++) {
			for(int k=0;k< intArray[i].length; k++) {
				System.out.print(intArray[i][k]);
				verticalArray[k][i] = intArray[i][k];
			}
			System.out.println("");
		}

		System.out.println("========================");
		for(int i=0; i< verticalArray.length; i++) {
			for(int k=0;k< verticalArray[i].length; k++) {
				System.out.print(verticalArray[i][k]);
			}
			System.out.println("");
		}

	}

}