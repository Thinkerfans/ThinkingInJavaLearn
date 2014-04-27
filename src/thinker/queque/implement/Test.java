package thinker.queque.implement;


public class Test {
	
	public static void main(String[] arg){
		

//		String[] kid = {"alice","bob","cindy","doug","ed",
//						"ferd","gene","hope","iren","jack",
//						"kin","lance","hike","nancy","ollie"};
//	
//		QueueArray q = new QueueArray();
//		
//		for(String s:kid){
//			q.enqueue(s);
//		}
		
//		q.Traversal();
//		System.out.println(Josephus(q, 5));
		
		QueueArray arr = new QueueArray(10);
//		QueueArrayOne arr = new QueueArrayOne(10);
		System.out.println(arr.getSize());
		System.out.println(arr.isEmpty());
		for(int i=0;i<10;i++){
			arr.enqueue(i);
		}
		arr.Traversal();
		System.out.println("---------------");
		for(int i=0;i<10;i++){
			System.out.println(arr.dequeue());
		}
		
		System.out.println(arr.getSize());
		System.out.println(arr.isEmpty());
	}
	
	
	public static Object Josephus(Queue q,int k){
		
		if(q.isEmpty())
			return null;
		while(1 < q.getSize()){
			
			q.Traversal();
			for(int i=0;i<k;i++){
				Object s = q.dequeue();
				q.enqueue(s);
			}
			
			Object out = q.dequeue();
			System.out.println("\n\t"+out+" out");		
		}	
		
		return q.dequeue();
	}

}
