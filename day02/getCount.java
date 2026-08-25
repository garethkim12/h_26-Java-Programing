package arraySet;

public class getCount {
	public static int getCount(int[] arr, int standard) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > standard) {
	            count++;
	        }
	    }
	    return count;
	}
}
