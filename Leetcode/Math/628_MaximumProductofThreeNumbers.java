import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        class Solution {
            public int maximumProduct(int[] nums) {
                int n = nums.length;
                Arrays.sort(nums);
                return Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
            }
        }
    }
}
