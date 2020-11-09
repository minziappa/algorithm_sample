package io.algorithm.convert;

import java.util.Scanner;

public class ConvertBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, m;
		String x = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Decimal Number:");
		n = s.nextInt();
		while(n > 0) {
			int a = n % 2;
			System.out.println("a=" + a);
			x = a + x;
			System.out.println("x=" + x);
			n = n / 2;
			System.out.println("n=" + n);
		}
		System.out.println(x);
	}

}
