package io.algorithm.main.number;

public class PrimeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int counter = 0;

		for (int n=2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				counter++;
				if (n % i == 0) {
					// This is not a prime number
					// So Let's go the next number. 4 -> 5
					break;
				}
			}

			if (n == i) {
				System.out.println(n);
			}

		}

		System.out.println("division count is " + counter);
	}

}
