package thinker.stack.implement;

import thinker.linkedlist.implement.Node;

public class StackLinked implements Stack{
	
	private Node top;
	private int size;

	
	public StackLinked() {
		top = null;
		size = 0;
	}
	
	

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}


	public void push(Object o) {
		Node next = new Node(o, top);
		top= next;
		size++;
	}


	public Object pop() throws ExceptionEmptyStack {
		if(isEmpty())
			throw new ExceptionEmptyStack("empty stack");
		Object o = top.getElement();
		top = top.getNext();
		size--;
		return o;
	}


	public Object top() throws ExceptionEmptyStack {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new ExceptionEmptyStack("empty stack");
		return top.getElement();
	}

}
