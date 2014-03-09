package thinker.deque.implement;

import thinker.queque.implement.ExceptionEmptyQueue;

/**
 *  double-ended queque /deck同音
 */
public interface Deque {
	
	public int getSize();
	public boolean isEmpty();
	public Object first() throws ExceptionEmptyQueue;
	public Object last() throws ExceptionEmptyQueue;
	public void insertFirst(Object o);
	public void insertLast(Object o);
	public Object removeFist() throws ExceptionEmptyQueue;
	public Object removeLast() throws ExceptionEmptyQueue;
	
}
