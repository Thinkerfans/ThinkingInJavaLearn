package thinker.stack.implement;

public class Test {
	
	public static void main(String[] arg){
		
//		StackArray arr = new StackArray(10);
		StackLinked arr = new StackLinked();
		
		System.out.println(arr.getSize());
		System.out.println(arr.isEmpty());
		for(int i=0;i<10;i++){
			arr.push(i);
			System.out.println(arr.top());
		}

		for(int i=0;i<10;i++){
			System.out.println(arr.pop());
		}
		
		System.out.println(arr.getSize());
		System.out.println(arr.isEmpty());
	}

}
