package com.study.datastructure.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUseList {
	private List<Integer> queue;
	private int front;
	private int rear;
	private int size;

	public MyQueueUseList(int size) {
		this.queue = new ArrayList<Integer>(size);
		this.front = 0;
		this.rear = -1;
		this.size = size;
	}

	public void enqueue(int data) {
		if (isFull()) {
			throw new IllegalStateException("queue is full");
		}
		rear++;
		queue.add(data);
	}

	public boolean isFull() {
		return rear == size - 1;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("queue is empty");
		}

		int data = queue.get(front);
		queue.remove(front);
		rear--;
		return data;
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public void print() {
		for (int data : queue) {
			System.out.println(data + " ");
		}
	}
}
