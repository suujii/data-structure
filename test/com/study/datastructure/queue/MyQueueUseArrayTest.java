package com.study.datastructure.queue;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUseArrayTest {
	private static final int QUEUE_SIZE = 10;

	@Test(expected = IllegalStateException.class)
	public void testWhenEmpty() {
		MyQueueUseArray q = new MyQueueUseArray(QUEUE_SIZE);
		q.dequeue();
	}

	@Test(expected = IllegalStateException.class)
	public void testWhenFull() {
		MyQueueUseArray q = new MyQueueUseArray(2);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidValue() {
		MyQueueUseArray q = new MyQueueUseArray(2);
		q.enqueue(-1);
	}

	@Test(expected = IllegalStateException.class)
	public void testWhenNotFull() { // queue가 가득찼을 때, 삭제된 공간도 사용할 수 있도록 개선 필요 -> circular queue
		MyQueueUseArray q = new MyQueueUseArray(2);
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
		q.print(); // 2, 3이어야 하지만 현재 구조로는 queue full
	}

	@Test
	public void testWhenSuccess() {
		MyQueueUseArray q = new MyQueueUseArray(QUEUE_SIZE);

		for (int i = 1; i <= QUEUE_SIZE; i++) {
			q.enqueue(i);
		}

		q.dequeue();
		q.dequeue();
		q.print(); // 3~10

		MyQueueUseArray q2 = new MyQueueUseArray(QUEUE_SIZE);
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
