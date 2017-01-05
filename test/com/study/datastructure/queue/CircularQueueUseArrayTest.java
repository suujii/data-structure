package com.study.datastructure.queue;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class CircularQueueUseArrayTest {
	private static final int QUEUE_SIZE = 10;

	@Test(expected = IllegalStateException.class)
	public void testWhenEmpty() {
		CircularQueueUseArray q = new CircularQueueUseArray(QUEUE_SIZE);
		q.dequeue();
	}

	@Test(expected = IllegalStateException.class)
	public void testWhenFull() {
		CircularQueueUseArray q = new CircularQueueUseArray(2);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidValue() {
		CircularQueueUseArray q = new CircularQueueUseArray(2);
		q.enqueue(-1);
	}

	@Test
	public void testWhenNotFull() {
		CircularQueueUseArray q = new CircularQueueUseArray(2);
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
		q.print(); // 2, 3
	}

	@Test
	public void testWhenSuccess() {
		CircularQueueUseArray q = new CircularQueueUseArray(QUEUE_SIZE);

		for (int i = 1; i <= QUEUE_SIZE; i++) {
			q.enqueue(i);
		}

		q.dequeue();
		q.dequeue();
		q.print(); // 3~10

		CircularQueueUseArray q2 = new CircularQueueUseArray(QUEUE_SIZE);
		q2.enqueue(1);
		q2.enqueue(2);
		q2.enqueue(3);
		q2.dequeue();
		q2.dequeue();
		q2.enqueue(4);
		q2.enqueue(5);
		q2.dequeue();

		q2.print(); //4,5
	}

	@Test
	public void testWhenSuccess2() {
		CircularQueueUseArray q2 = new CircularQueueUseArray(QUEUE_SIZE);
		q2.enqueue(1);
		q2.print(); // 1
	}
}
