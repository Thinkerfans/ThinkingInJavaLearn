package thinker.stack.implement;

public class StackArray implements Stack {
	
	private static final int DEFAULT_SIZE = 1024;	
	private Object[] array;	
	private int top;	
	private int capacity;
		
	public StackArray() {
		this(DEFAULT_SIZE);
	}
	
	public StackArray(int size) {
		top = -1;
		capacity = size;
		array = new Object[size];
	}


	public int getSize() {
		return top+1;
	}


	public boolean isEmpty() {
		return 0>top;
	}
	

	public void push(Object o) {
		if(getSize() == capacity)
			throw new ExceptionFullStack("stack full exception");
		array[++top] = o;		
	}
	

	public Object pop() throws ExceptionEmptyStack {
		if(isEmpty())
			throw new ExceptionEmptyStack("stack empty exception");
		Object o = array[top];
		array[top--] = null;
		return o;		
	}
	

	public Object top() throws ExceptionEmptyStack {
		if(isEmpty())
			throw new ExceptionEmptyStack("stack empty exception");
		return array[top];
	}
}
