package com.study.datastructure.stack;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUseArray {
	private int[] arr;
	private int top;
	private int size;

	public MyStackUseArray(int size) {
		this.arr = new int[size];
		this.top = -1;
		this.size = size;
	}

	public void push(int data) {
		if (isFull()) {
			throw new IllegalStateException("stack is Full");
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
		top--;
		return data;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void print() {
		for (int data : arr) {
			if (data != 0) {
				System.out.println(data + " ");
			}
		}
	}
}
