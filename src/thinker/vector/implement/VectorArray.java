package thinker.vector.implement;

public class VectorArray implements Vector {
	
	private final int  CAPACITY = 1024;
	Object[] arr;
	int size;

	public VectorArray() {
		arr = new Object[CAPACITY];
		size =0;
	}
	

	public int getSize() {
		return size;
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}


	public Object insertAtRank(int r, Object o)
			throws ExceptionBoundaryViolation {		
		if(0>r || size<r)
			throw new ExceptionBoundaryViolation(" out of boundary");
		if(size>=CAPACITY)
			throw new ExceptionBoundaryViolation("out of capacity");
		
		for(int i =size;i>r;i--)
			arr[i] = arr[r-1];
		arr[r] = o;
		size++;
		return o;
	}


	public Object removetAtRank(int r) throws ExceptionBoundaryViolation {
		if(0>r || size<=r)
			throw new ExceptionBoundaryViolation(" out of boundary");
		Object o =  arr[r];
		for(int i =r;i<size;i++)
			arr[r]=arr[i+1];
		size--;
		return o;
	}


	public Object getAtRank(int r) throws ExceptionBoundaryViolation {
		if(0>r || size<=r)
			throw new ExceptionBoundaryViolation(" out of boundary");
		return arr[r];
	}


	public Object replaceAtRank(int r, Object o)
			throws ExceptionBoundaryViolation {
		if(0>r || size<=r)
			throw new ExceptionBoundaryViolation(" out of boundary");		
		Object old = arr[r];
		arr[r] = o;
		return old;
	}
}
