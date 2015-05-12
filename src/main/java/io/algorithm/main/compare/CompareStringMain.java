package io.algorithm.main.compare;

import io.algorithm.compare.NameAscCompare;
import io.algorithm.compare.NoDescCompare;
import io.algorithm.compare.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<User> users = getUserList();
		for(User user : users) {
			System.out.println(user);
		}
		System.out.println("----------------------------");
		Collections.sort(users, new NameAscCompare());
		for(User user : users) {
			System.out.println(user);
		}
		System.out.println("----------------------------");
		Collections.sort(users, new NoDescCompare());
		for(User user : users) {
			System.out.println(user);
		}

	}

	private static List<User> getUserList() {
		
		 List<User> users = new ArrayList<User>();
		 User user = new User();
		 
		 user.setNo(2);
		 user.setName("고철수");
		 user.setAddress("경기도 성남시 분당구");
		 user.setPhone("010-1234-0192");
		 users.add(user);

		 user = new User();
		 user.setNo(1);
		 user.setName("박영희");
		 user.setAddress("부산 해운대");
		 user.setPhone("010-4234-0192");
		 users.add(user);

		 user = new User();
		 user.setNo(3);
		 user.setName("감수왕");
		 user.setAddress("충북 제천");
		 user.setPhone("010-7234-0192");
		 users.add(user);
		 
		 return users;
	}
}
