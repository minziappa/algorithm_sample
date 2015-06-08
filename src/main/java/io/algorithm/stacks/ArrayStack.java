package io.algorithm.stacks;

public class ArrayStack {

	private int top;
	private int maxSize;
	private Object[] stackArray;

	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		this.top = -1;
	}
	
	// The Stack is empty
	public boolean empty() {
		return (top == -1);
	}

	// The Stack is full
	public boolean full() {
		return (top == maxSize-1);
	}
	
	public void push(Object item) {
		if(full()) {
			throw new ArrayIndexOutOfBoundsException((top+1)+">="+maxSize);
		}
		stackArray[++top] = item;
	}
	
	public Object peek() {
		if(empty()) {
			throw new ArrayIndexOutOfBoundsException(top);
		}
		return stackArray[top];
	}
	
	public Object pop() {
		Object item = peek();
		top--;
		return item;
	}

}