package arraySet;

public class swapArray {
	public static void swapArray(int[] arr) {
	    int start = 0;
	    int end = arr.length - 1;

	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}
}
