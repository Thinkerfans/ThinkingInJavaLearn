package thinker.linkedlist.implement;

public class Node implements Position {

	private Object element;
	private Node next;

	public Node() {
		this(null, null);
	}

	public Node(Object o, Node n) {
		element = o;
		next = n;
	}


	public Object getElement() {
		return element;
	}


	public Object setElement(Object o) {
		Object old = element;
		element = o;
		return old;
	}

	public void setNext(Node o) {
		next = o;
	}

	public Node getNext() {
		return next;
	}
}
