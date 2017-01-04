package com.study.datastructure.queue;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUseArray {
	private int front;
	private int rear;
	private int[] arr;
	private int size;
	private static final int DATA_LIMIT = 0;

	public MyQueueUseArray(int size) {
		this.front = 0;
		this.rear = -1;
		this.arr = new int[size];
		this.size = size;

		for (int i = 0; i < size; i++) {
			this.arr[i] = -1;
		}
	}

	public void enqueue(int data) {
		if (isFull()) {
			throw new IllegalStateException("queue is Full");
		}

		if (data < DATA_LIMIT) {
			throw new IllegalArgumentException("data is invalid");
		}

		arr[++rear] = data;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("queue is empty");
		}

		int data = arr[front];
		arr[front] = -1;
		front++;

		return data;
	}

	public boolean isFull() {
		return rear == size - 1;
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public void print() {
		for (int index = front; index < arr.length; index++) {
			if (arr[index] != -1) {
				System.out.print(arr[index] + " ");
			}
		}
		System.out.print("\n");
	}
}
