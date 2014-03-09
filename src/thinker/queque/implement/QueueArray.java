package thinker.queque.implement;

public class QueueArray implements Queue {
	
	private static int DEFAULT_SIZE = 1024;
	private Object[] q;
	private int capacity;
	private int head;
	private int tail;
	
	public QueueArray() {	
		this(DEFAULT_SIZE);
	}
	
	public QueueArray(int size) {
		head = 0;
		tail = 0;
		capacity = size;
		q = new Object[size];
	}
	
	@Override
	public int getSize() {	
		return (capacity+tail-head) % capacity;
	}

	@Override
	public boolean isEmpty() {
		return tail==head;
	}

	@Override
	public Object front() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue ");
		return q[head];
	}

	@Override
	public void enqueue(Object o) throws ExceptionFullQueue {
		if(getSize() == capacity)
			throw new ExceptionFullQueue("full queue");
		q[tail] = o;
		tail = (tail +1)% capacity;
	}

	@Override
	public Object dequeue() throws ExceptionEmptyQueue {
		if(isEmpty())
			throw new ExceptionEmptyQueue("empty queue ");
		Object o = q[head];
		q[head] = null;
		head = (head +1) % capacity;
		return o;
	}

	@Override
	public void Traversal() {	
		for(int i = head;i<tail;i++)
			System.out.println(q[i]+" ");
		System.out.println();	
	}

}
