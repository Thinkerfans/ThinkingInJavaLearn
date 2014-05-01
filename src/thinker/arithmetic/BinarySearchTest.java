package thinker.arithmetic;

public class BinarySearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {2,21,25,64,72,324,334};
		System.out.println(BinarySearch(a, 2));
	}
	
	
	public static int BinarySearch(int[] src ,int key){		
		int low = 0,high = src.length-1;
		int middle = 0 ;
		while(low <= high){
			middle = (high+low)/2;
			if(key == src[middle]){
				return middle;
			}else if(key > src[middle]){
				low = middle+1;
			}else{
				high = middle -1;
			}
		}
		return -1;
	}
}