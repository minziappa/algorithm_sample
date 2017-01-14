package io.algorithm.main;

public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test >> " + solution(3, 4, 5));
	}

	public static int solution(int A, int B, int N) {

		int result = 0;

		for(int i=0; i < N; i++) {
			int intTemp = 0;

			if(i%2 == 0) {
				intTemp = A;
				System.out.println("A >> " + intTemp + ", i=" + i);
			} else {
				intTemp = B;
				System.out.println("B >> " + intTemp + ", i=" + i);
			}
			result = result + intTemp;
			System.out.println("result >> " + result + ", i=" + i);
		}

		return result;
	}

}
