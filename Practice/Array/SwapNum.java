package Array;

import java.util.Arrays;

public class SwapNum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 56};
        swap(arr, 2, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
