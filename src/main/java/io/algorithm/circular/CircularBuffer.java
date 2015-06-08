package io.algorithm.circular;

public class CircularBuffer {

	private Integer data[];
	private int head;
	private int tail;

	public CircularBuffer(Integer number) {
		data = new Integer[number];
		head = 0;
		tail = 0;
	}

	public boolean store(Integer value) {
		if (!bufferFull()) {
			data[tail++] = value;
		if (tail == data.length) {
			tail = 0;
		}
			return true;
		} else {
			return false;
		}
	}

	public Integer read() {
		if (head != tail) {
			int value = data[head++];
		if (head == data.length) {
			head = 0;
		}
			return value;
		} else {
			return null;
		}
	}

	private boolean bufferFull() {
		if (tail + 1 == head) {
			return true;
		}
		if (tail == (data.length - 1) && head == 0) {
			return true;
		}
		return false;
	}

}