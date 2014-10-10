package io.algorithm.main;

import io.algorithm.node.Node;

public class LinkedMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node1 = new Node(1, null);
		Node node2 = new Node(2, null);
		Node node3 = new Node(3, null);

		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		System.out.println(node2);

		printList(node1);

	}
	
	public static void printList(Node list) {
		Node node = list;
		
		while(node != null) {
			System.out.println(node);
			node = node.next;
		}
		System.out.println();
	}

}
