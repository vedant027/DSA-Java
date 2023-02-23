public class Runningsumof1DArray {

    public static void main(String[] args) {

        class Solution {
            public int[] runningSum(int[] nums) {
                int sum = 0;
                for(int i = 0; i < nums.length; i++){
                    // Adding sum of previous numbers with next element
                    sum = sum + nums[i];
                    nums[i] = sum;
                }
                // Returning the final sum
                return nums;
            }
        }
    }
}