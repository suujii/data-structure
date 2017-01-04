package com.study.datastructure.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUseList {
	private List<Integer> queue;
	private int size;

	public MyQueueUseList(int size) {
		this.queue = new ArrayList<Integer>(size);
		this.size = size;
	}

	public void enqueue(int data) {
		if (isFull()) {
			throw new IllegalStateException("queue is full");
		}
		queue.add(data);
	}

	public boolean isFull() {
		return queue.size() == size;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("queue is empty");
		}

		int data = queue.get(0);
		queue.remove(0);
		return data;
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}

	public void print() {
		for (int data : queue) {
			System.out.print(data + " ");
		}
		System.out.print("\n");
	}
}
