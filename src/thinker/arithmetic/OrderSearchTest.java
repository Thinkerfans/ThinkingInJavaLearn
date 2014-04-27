package thinker.arithmetic;

public class OrderSearchTest {

	public static void main(String[] args) {
		int a[] = {2,334,54,23,2,324,34};
		System.out.println(OrderSearch(a, 23));
	}
	
	
	public static int OrderSearch(int[] src ,int key){		
		for(int i = 0; i< src.length;i++){
			if( key == src[i]){
				return i;
			}
		}		
		return -1;
	}
	
	
}
