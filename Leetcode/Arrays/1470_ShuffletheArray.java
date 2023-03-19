public class ShuffletheArray {
    public static void main(String[] args) {
        class Solution {
            public int[] shuffle(int[] nums, int n) {
                int[] result = new int[2 * n];

                for(int i = 0; i < n; i++){
                    //  For even positions in the result array
                    result[2 * i] = nums[i];
                    //  For odd positions in the result array
                    result[2 * i + 1] = nums[n + i];
                }
                return result;
            }
        }
    }
}