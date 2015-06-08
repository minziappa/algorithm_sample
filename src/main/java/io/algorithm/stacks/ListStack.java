package io.algorithm.stacks;

public class ListStack {

	private Node top;

	// Node class
	private class Node {
		private Object data;
		private Node nextNode;

		Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public ListStack() {
		this.top = null;
	}

	public boolean empty() {
		return (top == null);
	}

	public void push(Object item) {
		Node newNode = new Node(item);
		newNode.nextNode = top;
		top = newNode;
	}

	public Object peek() {
		if(empty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return top.data;
	}

	public Object pop() {
		Object item = peek();
		top = top.nextNode;
		return item;
	}

}