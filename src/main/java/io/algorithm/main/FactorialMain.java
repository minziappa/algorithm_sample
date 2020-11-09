package io.algorithm.main;

import java.util.Scanner;

public class FactorialMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(getFactorial4(5));
	}

	public static int getFactorial4(int num) {
		if(num == 1) {
			return num;
		} else {
			return num * getFactorial4(num - 1);
		}
	}

	public static int getFactorial3(int num) {

		int n=1, i;
		for(i=n; i <= num; i++) {

			System.out.print(n+"*"+i);
			n = n*i;
			System.out.println("=" + n);
		}

		return n;
	}

	public static int getFactorial2(int num) {
		
		StringBuffer sb = new StringBuffer();

		for(int i=0; i < num; i++) {

			sb.append(num - i);
			if(num-i != 1) {
				sb.append("*");
			}

		}
		System.out.println(sb.toString());

		return 0;
		
	}

	public static int getFactorial1(int num) {
		
		StringBuffer sb = new StringBuffer();

		for(int i=0; i < num; i++) {

			sb.append(i+1);
			if(i != num-1) {
				sb.append("*");				
			}

		}
		System.out.println(sb.toString());

		return 0;
		
	}

}
