package com.study.datastructure.stack;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUseListTest {
	private static final int STACK_SIZE = 10;

	@Test(expected = IllegalStateException.class)
	public void testWhenEmpty() {
		MyStackUseList s = new MyStackUseList(STACK_SIZE);
		s.pop();
	}

	@Test(expected = IllegalStateException.class)
	public void testWhenFull() {
		MyStackUseList s = new MyStackUseList(2);
		s.push(1);
		s.push(2);
		s.push(3);
	}

	@Test
	public void testWhenSuccess() {
		MyStackUseList s = new MyStackUseList(STACK_SIZE);

		for (int i = 1; i <= STACK_SIZE; i++) {
			s.push(i);
		}

		s.print(); // 1 ~ 10
		s.pop();
		s.pop();

		s.print(); // 1 ~ 8

		s.push(5);
		s.push(3);

		s.print(); // 1 ~ 8, 5, 3

		MyStackUseList s2 = new MyStackUseList(STACK_SIZE);
		s2.push(1);
		s2.push(2);
		s2.push(3);
		s2.pop();

		s2.print(); // 1~2 
	}
}
