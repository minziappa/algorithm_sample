package io.verification;

public class FizzBuzz2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i <= 100; i++) {
			if(i%3 == 0) {
				if(i%5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");
				}
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
