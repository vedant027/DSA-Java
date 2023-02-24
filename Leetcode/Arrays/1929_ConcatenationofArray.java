public class ConcatenationofArray {
    public static void main(String[] args) {
        class Solution {
            public int[] getConcatenation(int[] nums) {
                int[] ans = new int[2 * nums.length];

                // Making a new array ans and doubling the size of input array with same input values
                for(int i=0; i < nums.length; i++){
                    ans[i] = ans[i + nums.length] = nums[i];
                }
                return ans;
            }
        }
    }
}
