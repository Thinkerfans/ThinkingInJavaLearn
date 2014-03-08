package thinker.stack.implement;

public interface Stack {
	
	public int getSize();
	public boolean isEmpty();
	public void push(Object o);
	public Object pop() throws ExceptionEmptyStack;
	public Object top() throws ExceptionEmptyStack;	
	
}
