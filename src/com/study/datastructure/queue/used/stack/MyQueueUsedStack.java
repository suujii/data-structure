package com.study.datastructure.queue.used.stack;

import java.util.Stack;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedStack {
	private Stack<Integer> pushStack;
	private Stack<Integer> popStack;

	public MyQueueUsedStack() {
		this.pushStack = new Stack<Integer>();
		this.popStack = new Stack<Integer>();
	}

	public void enqueue(Integer data) {
		if (popStack.isEmpty() == false) {
			int popStackSize = popStack.size();

			for (int i = 0; i < popStackSize; i++) {
				pushStack.add(popStack.pop());
			}
		}
		pushStack.push(data);
	}

	public Integer dequeue() {
		int size = pushStack.size();

		for (int i = 0; i < size; i++) {
			reverse();
		}
		return popStack.pop();
	}

	public void reverse() {
		popStack.push(pushStack.pop());
	}

	public void print() {
		int size = popStack.size();

		for (int i = 0; i < size; i++) {
			System.out.print(popStack.pop() + " ");
		}
		System.out.print("\n");
	}
}
