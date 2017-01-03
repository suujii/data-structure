package com.study.datastructure.queue;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueue {
	private int front;
	private int rear;
	private int[] arr;
	private int size;

	public MyQueue(int size) {
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
		this.size = size;
	}

	public void enqueue(int data) {
		if (isFull()) {
			throw new IllegalStateException("queue is Full");
		}

		arr[++front] = data;
		++rear;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("queue is empty");
		}

		int data = arr[rear];
		rear--;
		return data;
	}

	public boolean isFull() {
		return rear == size - 1;
	}

	public boolean isEmpty() {
		return front == rear;
	}
}
