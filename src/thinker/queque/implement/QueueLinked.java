package thinker.queque.implement;

import thinker.linkedlist.implement.Node;

public class QueueLinked implements Queue {
	
	
	private Node head;
	private Node tail;
	private int size;
	
	public QueueLinked() {
		// TODO Auto-generated constructor stub
		size=0;
		head = null;
		tail = null;
	}
	
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return 0==size;
	}

	@Override
	public Object front() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");
		
		return head.getElement();
	}

	@Override
	public void enqueue(Object o) throws ExceptionFullQueue {
		Node next = new Node(o,null);
		if(isEmpty())
			head = next;
		else
			tail.setNext(next);
		size++;
	}

	@Override
	public Object dequeue() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");
		Object o = head.getElement();
		head = head.getNext();
		size --;
//		if(isEmpty())
//			tail = null;
		return o;
	}

	@Override
	public void Traversal() {	
		Node p = head;
		while(null !=p){
			System.out.print(p.getElement() + " ");
			p = p.getNext();
		}		
		System.out.println("--------traversal over ---------");
	}

}
