package com.study.datastructure.queue.used.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedStackOne {
	private Stack<Integer> stack;

	public MyQueueUsedStackOne() {
		this.stack = new Stack<Integer>();
	}

	public void enqueue(Integer data) {
		if (stack.isEmpty() == false) {
			reverse();
		}

		stack.push(data);
		reverse();
	}

	public Integer dequeue() {
		return stack.pop();
	}

	public void reverse() {
		int size = stack.size();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {
			list.add(stack.pop());
		}

		for (Integer data : list) {
			stack.push(data);
		}
	}

	public void print() {
		int size = stack.size();

		for (int i = 0; i < size; i++) {
			System.out.print(stack.pop() + " ");
		}
		System.out.print("\n");
	}
}
