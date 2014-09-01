package io.algorithm.main;

import java.util.Scanner;

public class PowerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int testCases = in.nextInt();

        exponential(2,3);
	}

	public static double exponential(int num, int index) {
		
		double dbResult = Math.pow(num, index);		
		System.out.println(dbResult);

		return dbResult;
	}

}
