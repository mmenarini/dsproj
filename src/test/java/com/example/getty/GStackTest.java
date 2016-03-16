package com.example.getty;

import java.util.*;

import junit.framework.TestCase;

public class GStackTest extends TestCase {
	private GStack gstack;

	protected void setUp() {
		gstack = new GStack();
	}

	public void testPush() {
		gstack.push(11);
		assertEquals(11, gstack.peek());
		gstack.push(22);
		assertEquals(22, gstack.peek());
		assertEquals(2, gstack.load());
	}
	
	public void testPop() {
		gstack.push(3);
		assertEquals(3, gstack.pop());
		assertEquals(0, gstack.load());
		gstack.push(8);
		gstack.push(9);
		assertEquals(2, gstack.load());
		assertEquals(9, gstack.pop());
		assertEquals(1, gstack.load());
		assertEquals(8, gstack.pop());
		assertEquals(0, gstack.load());
	}
	
	public void testPeek() {
		gstack.push(4);
		gstack.push(5);
		gstack.push(6);
		assertEquals(3, gstack.load());
		assertEquals(6, gstack.peek());
		assertEquals(3, gstack.load());
		assertEquals(6, gstack.peek());
	}
}
