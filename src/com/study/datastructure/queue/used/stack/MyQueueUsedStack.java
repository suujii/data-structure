package com.study.datastructure.queue.used.stack;

import java.util.Stack;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedStack {
	private Stack<Integer> s1;
	private Stack<Integer> s2;

	public MyQueueUsedStack() {
		this.s1 = new Stack<Integer>();
		this.s2 = new Stack<Integer>();
	}

	public void enqueue(Integer data) {
		s1.push(data);
	}

	public Integer dequeue() {
		return s2.pop();
	}

	public void reverse() {
		s2.push(s1.pop());
	}
}
