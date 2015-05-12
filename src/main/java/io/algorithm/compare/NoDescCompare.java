package io.algorithm.compare;

import java.util.Comparator;

public class NoDescCompare implements Comparator<User>{

	public int compare(User o1, User o2) {
		
		if(o1.getNo() > o2.getNo()) {
			System.out.println("one >> o1 >> " + o1.getNo());
			return -1;
		} else if (o1.getNo() < o2.getNo()) {
			System.out.println("two >> o1 >> " + o1.getNo());
			System.out.println("two >> o2 >> " + o2.getNo());
			return 1;
		}

		return 0;
	}

}
