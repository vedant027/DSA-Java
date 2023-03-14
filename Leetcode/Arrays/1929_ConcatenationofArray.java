public class ConcatenationofArray {
    public static void main(String[] args) {
        class Solution {
            public int[] getConcatenation(int[] nums) {
                int n = nums.length;
                int[] ans = new int[2 * n];

                // Making a new array ans and doubling the size of input array with same input values
                for(int i=0; i < n; i++){
                    ans[i] = ans[i + n] = nums[i];
                }
                return ans;
            }
        }
    }
}
