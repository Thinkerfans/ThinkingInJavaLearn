package thinker.queque.implement;


public class QueueArrayOne implements Queue {
	
	private static final int DEFAULT_SIZE = 1024;
	private Object[] q;
	private int capacity;
	private int count;
	
	public QueueArrayOne() {
		this(DEFAULT_SIZE);
	}
	
	public QueueArrayOne(int size) {
		count = -1;
		capacity = size;
		q = new Object[capacity];		
	}
	

	@Override
	public int getSize() {	
		return count+1;
	}

	@Override
	public boolean isEmpty() {
		return count<0;
	}

	@Override
	public Object front() throws ExceptionEmptyQueue {
		
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");	
		return q[0];
	}

	@Override
	public void enqueue(Object o) throws ExceptionFullQueue {
		if(getSize() == capacity)
			throw new ExceptionFullQueue("full queue");
		q[++count] = o;
	}

	@Override
	public Object dequeue() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue");
		Object o = q[0];
		
		for(int i = 1;i<=count;i++){
			q[i-1] = q[i];
		}
		count --;
		return o;
	}

	@Override
	public void Traversal() {	
		for(int i = 0;i<=count;i++){
			System.out.print(q[i]+" ");
		}
		System.out.println();
	}

}
