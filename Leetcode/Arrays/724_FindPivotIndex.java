public class FindPivotIndex {
    public static void main(String[] args) {
        class Solution {
            public int pivotIndex(int[] nums) {
                int total_sum=0;
                // Creating loop for calculating total sum
                for(int i=0; i<nums.length; i++){
                    total_sum += nums[i];
                }

                // Creating loop for calculating the left sum
                int left_sum=0;
                for(int i=0; i<nums.length; i++){
                    if(i != 0) left_sum += nums[i-1];
                    if(total_sum - left_sum - nums[i] == left_sum){
                        return i;
                    }
                }
                return -1;
            }
        }
    }
}