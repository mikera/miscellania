package mikera.misc;

public class BinarySearch {
	// Binary search for a target value in a given sorted array
	// returns:
	//    -1 if not found
	//    index of target value if found
	
	public static int search(int[] array, int target) {
		return search(array,target,0,array.length);
	}
	
	// search within range, inclusive of start index, exclusive of end index
	public static int search(int[] array, int target, int start, int end) {
		if (start>=end) return -1;
		
		int middle=(start+end)/2;
		
		int middleValue=array[middle];
		
		if (target==middleValue) {
			// we have found it!
			return middle;
		} else if (target<middleValue) {
			// search bottom part
			return search(array,target,start,middle);
		} else {
			// search top part
			return search(array,target,middle+1,end);
		}
	}
	
	public static void main(String[] args) {
		if (search(new int[] {1,2,3,5},   3) != 2  ) throw new Error("Whoops!");
		if (search(new int[] {1,2,3,5},   9) != -1 ) throw new Error("Whoops!");
		if (search(new int[] {1,2,3,5}, -10) != -1 ) throw new Error("Whoops!");
		if (search(new int[] {1,2,3,5}, 4  ) != -1 ) throw new Error("Whoops!");
		if (search(new int[] {1,2,3,5}, 1  ) != 0  ) throw new Error("Whoops!");		
		if (search(new int[] {1,2,3,5}, 5  ) != 3  ) throw new Error("Whoops!");		
		if (search(new int[] {},        1  ) != -1 ) throw new Error("Whoops!");		
		System.out.println("All OK!");
	}
}
