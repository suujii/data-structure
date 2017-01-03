package com.study.datastructure.stack;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUseArray {
	private int[] arr;
	private int top;
	private int size;
	private static final int DATA_LIMIT = 0;

	public MyStackUseArray(int size) {
		this.arr = new int[size];
		this.top = -1;
		this.size = size;

		for (int i = 0; i < size; i++) {
			this.arr[i] = -1;
		}
	}

	public void push(int data) {
		if (isFull()) {
			throw new IllegalStateException("stack is Full");
		}

		if (data < DATA_LIMIT) {
			throw new IllegalArgumentException("data is invalid");
		}

		arr[++top] = data;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("stack is Empty");
		}

		int data = arr[top];
		arr[top] = -1;
		top--;
		return data;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void print() {
		for (int data : arr) {
			if (data != -1) {
				System.out.println(data + " ");
			}
		}
	}
}
