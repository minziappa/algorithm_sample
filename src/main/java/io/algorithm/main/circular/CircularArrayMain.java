package io.algorithm.main.circular;

public class CircularArrayMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int n=5;
		int [] arr = new int[n];
		for(int i=1; i <= n; i++) arr[i-1]=i;

		for(int i=0; i < 100; i++) {
			System.out.println("i" + i + "%" + n + "=" + i%n);
			System.out.println(arr[i%n]);
		}

	}

}
