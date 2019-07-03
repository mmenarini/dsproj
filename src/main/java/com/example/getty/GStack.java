package com.example.getty;

// GStack class
//
// CONSTRUCTION: with or without a capacity; default is 8
//
// ******************PUBLIC OPERATIONS*********************
// void push( x )         --> Insert x
// void pop( )            --> Remove most recently inserted item
// Object top( )          --> Return most recently inserted item
// Object topAndPop( )    --> Return and remove most recently inserted item
// boolean isEmpty( )     --> Return true if empty; else false
// boolean isFull( )      --> Return true if full; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// Overflow and Underflow thrown as needed

import java.util.ListIterator;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Array-based implementation of the stack. Added functionalities and
 * restrictions for research purpose
 * 
 * @author Mark Allen Weiss
 * @author Yan Yan (yayan@cs.ucsd.edu)
 */
public class GStack {

	private Object[] internalArray;
	private int topIndex;
	public boolean error;
	private int capacity;

	/**
	 * Construct the stack.
	 *
	 * @param capacity
	 *            the capacity.
	 */
	public GStack(int capacity) {
		internalArray = new Object[capacity];
		this.capacity = capacity;
		topIndex = -1;
		error = false;
	}

	/**
	 * Test if the stack is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return topIndex == -1;
	}

	/**
	 * Test if the stack is logically full.
	 * 
	 * @return true if full, false otherwise.
	 */
	public boolean isFull() {
		return topIndex == internalArray.length - 1;
	}

	/**
	 * Make the stack logically empty.
	 */
	public void makeEmpty() {
		java.util.Arrays.fill(internalArray, 1, topIndex + 1, null);
		topIndex = -1;
	}

	/**
	 * Get the most recently inserted item in the stack. Does not alter the
	 * stack.
	 * 
	 * @return the most recently inserted item in the stack, or null, if empty.
	 */
	public Object peek() {
		error = false;
		if (isEmpty())
			return null;
		else
			return internalArray[topIndex];
	}

	/**
	 * Remove the most recently inserted item from the stack.
	 * 
	 */
	public Object pop() {
		error = false;
		Object topItem = peek();
		if (!isEmpty()) {			
			internalArray[topIndex] = null;
			topIndex -= 1;
		}
		return topItem;
	}

	/**
	 * Insert a new item into the stack, if not already full.
	 * 
	 * @param x
	 *            the item to insert.
	 */
	public boolean push(Object x) {
		error = false;
		if (isFull()) {
			return false;
		} else {
			topIndex ++;
			internalArray[topIndex] = x;
			return true;
		}
	}

	/**
	 * Insert a new item into the stack at the index y, if not already full.
	 *
	 * @param x
	 *            the item to insert.
	 * @param y
	 * 			  the index in the stack.
	 */
	/*public boolean pushTo(Object x, int y) {
		error = false;
		if (isFull()) {
			return false;
		} else {
			topIndex ++;
			internalArray[y] = x;
			return true;
		}
	}*/

	/**
	 * Sort the contents of the stack in ascending order.
	 * Only applies to stacks of ints.
	 *
	 */
	/*public void sort() {
		if (!isEmpty()) {
			int topItem = (int) pop();
			sort();
			sortedInsert(topItem);
		}
	}*/

	/**
	 * Insert the sorted contents of the stack in ascending order.
	 * Only applies to stacks of ints.
	 *
	 */
	/*public void sortedInsert(int top) {
		if (isEmpty() || top < (int) peek()) {
			push(top);
			return;
		} else {
			int temp = (int) pop();
			sortedInsert(top);
			push(temp);
		}
	}*/

	/**
	 * Reverse the order of the contents of the stack.
	 *
	 */
	/*public void reverse() {
		if (!isEmpty()) {
			int temp = (int) peek();
			pop();
			reverse();
			insertLast(temp);
		} else {
			return;
		}
	}*/

	/**
	 * Insert the item last in the stack.
	 *
	 */
	/*public void insertLast(int item) {
		if (isEmpty()) {
			push(item);
		} else {
			int temp = (int) peek();
			pop();
			insertLast(item);
			push(temp);
		}
	}*/


	/**
	 * Randomize the order of the contents of the stack.
	 *
	 */
	/*public void shuffle() {
		Random rnd = ThreadLocalRandom.current();
		if (!isEmpty()) {
			int index = rnd.nextInt(load());
			Object temp = pop();
			pushTo(temp, index);
		}
	}*/

	/**
	 * Get the current load (size) of the stack.
	 * 
	 */
	public int load() {
		return topIndex + 1;
	}

}
