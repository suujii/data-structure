package com.study.datastructure.queue;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueMain {
	private static final int QUEUE_SIZE = 10;

	public static void main(String[] args) {
		MyQueue q = new MyQueue(QUEUE_SIZE);

		for (int i = 1; i <= QUEUE_SIZE; i++) {
			q.enqueue(i);
		}

		for (int i = 1; i <= QUEUE_SIZE; i++) {
			System.out.print(q.dequeue() + " ");
		}
	}
}
