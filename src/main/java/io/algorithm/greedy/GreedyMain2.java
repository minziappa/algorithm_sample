package io.algorithm.greedy;

import java.util.Scanner;

public class GreedyMain2 {

	public static int[] coinArray = {500, 100, 50, 10, 5, 1};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int changeMoney = 1000 - sc.nextInt();
		int idx = 0;
		int changedCnt = 0;
		
		while (changeMoney != 0 && changeMoney > coinArray[coinArray.length - 1]) {
			try {
				// Get count of coins
				int rtnCoinCnt = changeMoney / coinArray[idx];

				// Total change money - Max big money
				changeMoney = changeMoney - rtnCoinCnt * coinArray[idx];

				// Plus count coin
				changedCnt = changedCnt + rtnCoinCnt;
				
				idx++;
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
		}

		System.out.println(changedCnt);
	}

}
