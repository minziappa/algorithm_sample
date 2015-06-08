package io.algorithm.main.circular;

import io.algorithm.circular.CircularBuffer;

public class CircularBufferMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    CircularBuffer c = new CircularBuffer(8);

	    System.out.println("Storing: 1");
	    c.store(1);
	    System.out.println("Reading: " + c.read());
	    System.out.println("Storing: 2");
	    c.store(2);
	    System.out.println("Storing: 3");
	    c.store(3);
	    System.out.println("Storing: 4");
	    c.store(4);
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	    System.out.println("Storing: 8");
	    c.store(8);
	    System.out.println("Storing: 9");
	    c.store(9);
	    System.out.println("Storing: 10");
	    c.store(10);
	    System.out.println("Storing: 11");
	    c.store(11);
	    System.out.println("Storing: 12");
	    c.store(12);
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	    System.out.println("Reading: " + c.read());
	}

}
