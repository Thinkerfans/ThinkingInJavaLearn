package thinker.linkedlist.implement;


public class DLNode implements Position {
	
	private Object elem;
	private DLNode prev;
	private DLNode next;
	
	public DLNode() {
		// TODO Auto-generated constructor stub
		this(null,null,null);
	}
	
	public DLNode(Object o,DLNode prev,DLNode next) {
		elem=o;
		this.prev = prev;
		this.next = next;
	
	}
	
	@Override
	public Object getElement() {
		// TODO Auto-generated method stub
		return elem;
	}

	@Override
	public Object setElement(Object o) {
		// TODO Auto-generated method stub
		Object last = elem;
		elem =o;	
		return last;
	}

	public DLNode getPrev() {
		return prev;
	}

	public void setPrev(DLNode prev) {
		this.prev = prev;
	}

	public DLNode getNext() {
		return next;
	}

	public void setNext(DLNode next) {
		this.next = next;
	}
	
	

}
