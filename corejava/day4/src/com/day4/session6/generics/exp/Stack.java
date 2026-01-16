package com.day4.session6.generics.exp;

import java.lang.reflect.Array;

public class Stack<T> {

	private T[] elements;
	private final int SIZE;
	private int top;

	public Stack(Class<T> clazz, int capacity) {
		this.SIZE = capacity;
		this.elements = (T[]) Array.newInstance(clazz, capacity);
		this.top = -1;
	}

	public void push(T element) {
		if (top >= SIZE - 1)
			throw new OverFlowEx();
		else
			elements[++top] = element;
	}

	public T pop() {
		if (top == -1)
			throw new UnderFlowEx();
		else
			return elements[top--];
	}
}
