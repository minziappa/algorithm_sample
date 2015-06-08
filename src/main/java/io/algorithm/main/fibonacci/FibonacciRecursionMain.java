package io.algorithm.main.fibonacci;

public class FibonacciRecursionMain {

	private static int fibonacci(int n) {
		System.out.println("test >>> " + n);
		if(n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for(int i=0; i<10;i++) {
			System.out.println("-" + fibonacci(3));
		//}

	}

}