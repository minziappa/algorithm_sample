package io.algorithm.sort;

public class BubbleSort {

	
	public static int[] sort(int[] args) {
		
		int intTemp;
		int cnt = 0;

		for(int m=0;m<args.length;m++) {
			System.out.print(args[m]);
		}

		System.out.println("");
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i] + " - ");
			for(int j=0; j<args.length - 1 - i; j++) {
				cnt++;
				if(args[j] > args[j + 1]) {
					intTemp = args[j];
					args[j] = args[j+1];
					args[j+1] = intTemp;
				}
				System.out.print(args[j]);
			}

			System.out.println("");
		}
		for(int m=0;m<args.length;m++) {
			System.out.print(args[m]);
		}
		System.out.println("");
		System.out.println("cnt = " + cnt);
		return args;
	}

}
