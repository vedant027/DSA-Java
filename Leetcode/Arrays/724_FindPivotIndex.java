public class FindPivotIndex {
    public static void main(String[] args) {
        class Solution {
            public int pivotIndex(int[] nums) {
                int totalSum=0;
                int leftSum=0;

                // Creating loop for calculating total sum
                for(int i=0; i<nums.length; i++){
                    totalSum += nums[i];
                }
                // Creating loop for calculating the left sum
                for(int i=0; i<nums.length; i++){
                    if(i != 0) leftSum += nums[i-1];
                    if(totalSum - leftSum - nums[i] == leftSum){
                        return i;
                    }
                }
                return -1;
            }
        }
    }
}