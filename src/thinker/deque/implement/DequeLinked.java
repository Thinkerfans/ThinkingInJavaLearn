package thinker.deque.implement;

import thinker.linkedlist.implement.DLNode;
import thinker.queque.implement.ExceptionEmptyQueue;

public class DequeLinked implements Deque{
	
	private DLNode header;
	private DLNode tailer;
	private int size;
	
	public DequeLinked() {
		header = new DLNode();
		tailer = new DLNode();
		header.setNext(tailer);
		tailer.setPrev(header);
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


	public Object first() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");
		
		return header.getNext().getElement();
	}


	public Object last() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");
		return tailer.getPrev().getElement();
	}


	public void insertFirst(Object o) {
		DLNode next = header.getNext();
		DLNode first = new DLNode(o,header,next);
		header.setNext(first);
		next.setPrev(first);
		size++;
	}


	public void insertLast(Object o) {
		DLNode next = tailer.getPrev();
		DLNode last = new DLNode(o,next,tailer);
		next.setNext(last);
		tailer.setPrev(last);
		size++;		
	}


	public Object removeFist() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");
		
		DLNode first = header.getNext();
		header.setNext(first.getNext());
		first.getNext().setPrev(header);
		size --;
		
		return first.getElement();
	}


	public Object removeLast() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");
		
		DLNode last = tailer.getPrev();
		last.getPrev().setNext(tailer);
		tailer.setPrev(last.getPrev());
		size --;
		return null;
	}

}
