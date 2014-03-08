package thinker.queque.implement;

public class Test {
	
	public static void main(String[] arg){
		
		QueueArrayOne arr = new QueueArrayOne(10);
		System.out.println(arr.getSize());
		System.out.println(arr.isEmpty());
		for(int i=0;i<10;i++){
			arr.enqueue(i);
			System.out.println(arr.front());
		}
		arr.Traversal();
		System.out.println("---------------");
		for(int i=0;i<10;i++){
			System.out.println(arr.dequeue());
		}
		
		System.out.println(arr.getSize());
		System.out.println(arr.isEmpty());
	}

}
