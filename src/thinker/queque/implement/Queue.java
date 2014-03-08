package thinker.queque.implement;

public interface Queue {
	
	public int getSize();
	public boolean isEmpty();
	
	public Object front() throws ExceptionEmptyQueue ;
	public void enqueue(Object o) throws ExceptionFullQueue;
	public Object dequeue() throws ExceptionEmptyQueue;
	
	public void Traversal();
	
}
