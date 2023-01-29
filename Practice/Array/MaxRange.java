package Array;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 8};
        System.out.println(maxRange(arr, 2, 4));
    }

    static int maxRange(int[] arr, int start, int end){

        if(start > end){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int maxVal = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
