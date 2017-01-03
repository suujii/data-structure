/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.study.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUseList {
	private List<Integer> stack;
	private int top;
	private int size;

	public MyStackUseList(int size) {
		this.stack = new ArrayList<Integer>(size);
		this.top = -1;
		this.size = size;
	}

	public void push(int data) {
		if (isFull()) {
			throw new IllegalStateException("stack is Full");
		}
		stack.add(data);
		top++;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("stack is Empty");
		}

		int data = stack.get(top);
		stack.remove(top);
		top--;
		return data;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void print() {
		for (int data : stack) {
			System.out.println(data + " ");
		}
	}
}
