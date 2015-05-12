package io.algorithm.compare;

import java.util.Comparator;

public class NameAscCompare implements Comparator<User> {

	public int compare(User o1, User o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
