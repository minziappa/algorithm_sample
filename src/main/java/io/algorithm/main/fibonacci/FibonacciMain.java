package io.algorithm.main.fibonacci;

public class FibonacciMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i < 10; i++) {
			int sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}

}
