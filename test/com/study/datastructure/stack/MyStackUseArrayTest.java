package com.study.datastructure.stack;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUseArrayTest {
	private static final int STACK_SIZE = 10;

	@Test
	public void test() {
		System.out.println("==== test1 ====");
		MyStackUseArray s = new MyStackUseArray(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();

		s.print();
	}

	@Test
	public void test2() {
		System.out.println("==== test2 ====");
		MyStackUseArray s = new MyStackUseArray(STACK_SIZE);

		for (int i = 1; i <= STACK_SIZE; i++) {
			s.push(i);
		}

		s.print();
	}
}
