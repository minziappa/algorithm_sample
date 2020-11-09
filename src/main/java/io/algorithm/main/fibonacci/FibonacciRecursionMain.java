package io.algorithm.main.fibonacci;

public class FibonacciRecursionMain {

	private static int fibonacci(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		//System.out.println("test >>> " + n);
		return fibonacci(n-1) + fibonacci(n-2);
	}

//	private static int fibonacci2(int n) {
//		// System.out.println("test >>> " + n);
//		if(n == 0 || n == 1) {
//			return n;
//		}
//		
//		int aSide = fibonacci2(n-1);
//		int bSide = fibonacci2(n-2);
//
//		return aSide + bSide ;
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<10;i++) {
			//System.out.println("i=" + i);
			System.out.println(fibonacci(i));
		}

	}

}