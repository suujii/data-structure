package com.study.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUseList {
	private List<Integer> stack;
	private int size;

	public MyStackUseList(int size) {
		this.stack = new ArrayList<Integer>(size);
		this.size = size;
	}

	public void push(int data) {
		if (isFull()) {
			throw new IllegalStateException("stack is Full");
		}
		stack.add(data);
	}

	public boolean isFull() {
		return stack.size() == size;
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("stack is Empty");
		}

		int top = stack.size() - 1;
		int data = stack.get(top);
		stack.remove(top);
		return data;
	}

	public boolean isEmpty() {
		return stack.size() == 0;
	}

	public void print() {
		for (int data : stack) {
			System.out.println(data + " ");
		}
	}
}
