package com.study.datastructure.queue;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUseListTest {
	private static final int QUEUE_SIZE = 10;

	@Test(expected = IllegalStateException.class)
	public void testWhenEmpty() {
		MyQueueUseList q = new MyQueueUseList(QUEUE_SIZE);
		q.dequeue();
	}

	@Test(expected = IllegalStateException.class)
	public void testWhenFull() {
		MyQueueUseList q = new MyQueueUseList(2);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
	}

	@Test
	public void testWhenNotFull() {
		MyQueueUseList q = new MyQueueUseList(2);
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
		q.print(); // 2,3
	}

	@Test
	public void testWhenSuccess() {
		MyQueueUseList q = new MyQueueUseList(QUEUE_SIZE);

		for (int i = 1; i <= QUEUE_SIZE; i++) {
			q.enqueue(i);
		}

		q.dequeue();
		q.dequeue();
		q.print(); // 3~10

		MyQueueUseList q2 = new MyQueueUseList(QUEUE_SIZE);
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

}
