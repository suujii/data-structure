package com.study.datastructure.queue.used.stack;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedStackMain {
	private static final int QUEUE_SIZE = 10;

	public static void main(String[] args) {
		MyQueueUsedStack q = new MyQueueUsedStack();

		for (Integer i = 1; i <= QUEUE_SIZE; i++) {
			q.enqueue(i);
		}

		for (Integer i = 1; i < QUEUE_SIZE; i++) {
			System.out.print(q.dequeue() + " ");
		}

	}
}
