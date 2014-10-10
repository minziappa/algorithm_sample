package io.algorithm.node;

public class Node {
	public int cargo;
	public Node next;

	public Node() {
		cargo=0;
		next=null;
	}

	public Node(int cargo, Node next) {
		this.cargo = cargo;
		this.next = next;
	}

	public String toString() {
		return cargo + "";
	}

}
