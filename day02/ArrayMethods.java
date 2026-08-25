package arraySet;

public class ArrayMethods {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 4, 6};

        System.out.println("합계: " + getSum(numbers));
        System.out.println("최댓값: " + getMax(numbers));
        System.out.println("5보다 큰 수의 개수: " + getCount(numbers, 5));

        swapArray(numbers);
        System.out.print("역순 배열: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getCount(int[] arr, int standard) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > standard) {
                count++;
            }
        }
        return count;
    }

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