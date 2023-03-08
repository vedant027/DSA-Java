public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        class Solution {
            public int[] leftRigthDifference(int[] nums) {
                int n = nums.length;
                int[] leftSum = new int[n];
                int[] rightSum = new int[n];
                int[] ans = new int[n];
                leftSum[0] = 0;
                rightSum[n-1] = 0;

//      Calculating the leftSum
                for(int i=0; i<n-1; i++){
                    leftSum[i+1] = leftSum[i] + nums[i];
                }

//      Calculating the rightSum
                for(int i=n-1; i>0; i--){
                    rightSum[i-1] = rightSum[i] + nums[i];
                }

//      Calculating the ans array by substracting the leftSum and rightSum
                for(int i=0; i<n; i++){
                    ans[i] = (int)Math.abs(leftSum[i] - rightSum[i]);
                }
                return ans;
            }
        }
    }
}