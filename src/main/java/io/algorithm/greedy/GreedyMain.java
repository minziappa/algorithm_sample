package io.algorithm.greedy;

import java.util.Scanner;

public class GreedyMain {

	public static int change;
	public static int count;
	
	public static int[] coinArray = {500, 100, 50, 10, 5, 1};
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		change = 1000 - sc.nextInt();
		
		for(int coin: coinArray) {
			count(coin);
		}

		System.out.println(count);
	}

	public static void count(int coin) {
		count = count + (change / coin);
		change = change - (coin * (change / coin));
	}

}
