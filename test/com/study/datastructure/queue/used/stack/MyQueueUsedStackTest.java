package com.study.datastructure.queue.used.stack;

import org.junit.Before;
import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedStackTest {
	private static final int QUEUE_SIZE = 4;

	private MyQueueUsedStack q;

	@Before
	public void setUp() {
		q = new MyQueueUsedStack();
	}

	@Test
	public void testWhenSuccess() {
		for (Integer i = 1; i <= QUEUE_SIZE; i++) {
			q.enqueue(i);
		}

		q.dequeue();
		q.dequeue();
		q.print(); // 3, 4
	}

	@Test
	public void testWhenSuccess2() {
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.print(); // 4, 5
	}

	@Test
	public void testWhenSuccess3() {
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.dequeue();
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.print(); // 5
	}

}
