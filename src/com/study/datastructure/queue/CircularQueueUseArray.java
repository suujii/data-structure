package com.study.datastructure.queue;

/**
 * @author SuJi, Lee
 *
 */
public class CircularQueueUseArray {
	private int front;
	private int rear;
	private int[] arr;
	private int size;
	private static final int DATA_LIMIT = 0;

	//test4

	public CircularQueueUseArray(int size) {
		this.front = 0;
		this.rear = 0;
		this.arr = new int[size + 1]; // 포화 상태와 빈 상태가 구분 되지 않아 size + 1 
		this.size = size + 1;

		for (int i = 0; i <= size; i++) {
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
		arr[rear] = data;
		++rear;
		rear = rear % size;
	}

	public boolean isFull() {
		return (rear + 1) % size == front;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("queue is empty");
		}

		int data = arr[front];
		arr[front] = -1;

		++front;
		front = front % size;

		return data;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public void print() {
		for (int index = front; index != rear; index = ++index % size) {
			System.out.print(arr[index] + " ");
		}
		System.out.print("\n");
	}
}
