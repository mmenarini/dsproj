package com.example.getty;

import java.util.*;

import junit.framework.TestCase;

import static sun.misc.Version.print;

public class GStackTest extends TestCase {
	private GStack gstack;

	protected void setUp() {
		gstack = new GStack(8);
	}

	/*public void testShuffle() {
		gstack.push(11);
		gstack.push(3);
		gstack.push(22);
		assertEquals(22, gstack.peek());
		gstack.shuffle();
		assertEquals(22, gstack.peek());

	}*/

	/*public void testReverse() {
		gstack.push(11);
		gstack.push(3);
		gstack.push(22);
		assertEquals(22, gstack.peek());
		gstack.reverse();
		assertEquals(11, gstack.peek());
	}*/

	/*public void testSort() {
		gstack.push(11);
		gstack.push(3);
		gstack.push(22);
		assertEquals(22, gstack.peek());
		gstack.sort();
		assertEquals(3, gstack.peek());
	}*/

	/*public void testMakeEmpty() {
		gstack.push(11);
		assertEquals(11, gstack.peek());
		gstack.peek();
		gstack.makeEmpty();
		assertEquals(0, gstack.load());
	}*/

	public void testPush() {
		gstack.push(11);
		assertEquals(11, gstack.peek());
		gstack.peek();
		gstack.push(22);
		assertEquals(22, gstack.peek());
		gstack.peek();
		assertEquals(2, gstack.load());
		gstack.load();
	}

	public void testPop() {
		gstack.push(3);
		assertEquals(3, gstack.pop());
		gstack.pop();
		assertEquals(0, gstack.load());
		gstack.load();
		gstack.push(8);
		gstack.push(9);
		assertEquals(2, gstack.load());
		gstack.load();
		assertEquals(9, gstack.pop());
		gstack.pop();
		assertEquals(0, gstack.load());
		gstack.load();
		assertEquals(null, gstack.pop());
		gstack.pop();
		assertEquals(0, gstack.load());
		gstack.load();
	}
	
	public void testPeek() {
		gstack.push(4);
		gstack.push(5);
		gstack.push(6);
		assertEquals(3, gstack.load());
		gstack.load();
		assertEquals(6, gstack.peek());
		gstack.peek();
		assertEquals(3, gstack.load());
		gstack.load();
		assertEquals(6, gstack.peek());
		gstack.peek();
	}
	
//	public void testPushAntiOverflow() {
//		gstack = new GStack(4);
//		gstack.push(7);
//		gstack.push(8);
////		assertEquals(2, gstack.load());
//		gstack.load();
////		assertEquals(8, gstack.peek());
//		gstack.peek();
//		gstack.push(9);
//		gstack.push(10);
//		gstack.push(11);
////		assertEquals(4, gstack.load());
//		gstack.load();
////		assertEquals(10, gstack.peek());
//		gstack.peek();
//		System.out.println("had run anti-overflow");
//	}
//	
//	public void testPopAntiUnderflow() {
//		gstack.push(9);
//		gstack.push(-2);
//		gstack.pop();
////		assertEquals(1, gstack.load());
//		gstack.load();
////		assertEquals(9, gstack.peek());
//		gstack.peek();
////		assertEquals(9, gstack.pop());
//		gstack.pop();
////		assertEquals(0, gstack.load());
//		gstack.load();
////		assertEquals(null, gstack.peek());
//		gstack.peek();
//		gstack.pop();
////		assertEquals(0, gstack.load());
//		gstack.load();
//		System.out.println("had run anti-underflow");
//	}
	
}
