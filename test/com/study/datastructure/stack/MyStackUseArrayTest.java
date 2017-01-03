package com.study.datastructure.stack;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUseArrayTest {
	private static final int STACK_SIZE = 10;

	@Test(expected = IllegalStateException.class)
	public void testWhenEmpty() {
		MyStackUseArray s = new MyStackUseArray(STACK_SIZE);
		s.pop();
	}

	@Test(expected = IllegalStateException.class)
	public void testWhenFull() {
		MyStackUseArray s = new MyStackUseArray(2);
		s.push(1);
		s.push(2);
		s.push(3);
	}

	@Test
	public void testWhenNotFull() {
		MyStackUseArray s = new MyStackUseArray(2);
		s.push(1);
		s.push(2);
		s.pop();
		s.push(3);
		s.print(); // 1,3
	}

	@Test
	public void testWhenSuccess() {
		MyStackUseArray s = new MyStackUseArray(STACK_SIZE);

		for (int i = 1; i <= STACK_SIZE; i++) {
			s.push(i);
		}

		System.out.println("== test1 ==");
		s.print(); // 1 ~ 10
		s.pop();
		s.pop();

		System.out.println("== test2 ==");

		s.print(); // 1 ~ 8

		s.push(5);
		s.push(3);

		System.out.println("== test3 ==");
		s.print(); // 1 ~ 8, 5, 3

		MyStackUseArray s2 = new MyStackUseArray(STACK_SIZE);
		s2.push(1);
		s2.push(2);
		s2.push(3);
		s2.pop();

		System.out.println("== test4 ==");
		s2.print(); // 1~2 

		MyStackUseArray s3 = new MyStackUseArray(STACK_SIZE);
		s3.push(1);
		s3.push(2);
		s3.push(3);
		s3.pop();
		s3.push(5);
		s3.pop();
		s3.push(6);

		System.out.println("== test5 ==");
		s3.print(); // 1,2,6 
	}
}
