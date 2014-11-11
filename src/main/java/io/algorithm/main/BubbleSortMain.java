package io.algorithm.main;

public class BubbleSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] num = new int[] {3,5,2,4,8,9,6,1};

		for (int i=0; i < num.length; i++ ) {
			System.out.println("before >> " + num[i]);
		}


		int j;
		boolean flag = true;
		int temp;
		
		while(flag) {
			
			flag = false;
			for(j=0; j < num.length-1; j++) {
				if(num[j] < num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = true;
				}
			}

		}

		for (int i=0; i < num.length; i++ ) {
			System.out.println("after >> " + num[i]);
		}

	}

}