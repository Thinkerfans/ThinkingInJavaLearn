package thinker.vector.implement;

public interface Vector {
	
	public int getSize();
	public boolean isEmpty();

	public Object insertAtRank(int r,Object o) throws ExceptionBoundaryViolation;
	public Object removetAtRank(int r)throws ExceptionBoundaryViolation;
	public Object getAtRank(int r)throws ExceptionBoundaryViolation;
	public Object replaceAtRank(int r,Object o)throws ExceptionBoundaryViolation;

}
