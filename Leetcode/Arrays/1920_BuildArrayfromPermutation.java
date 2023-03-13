class BuildArrayfromPermutation {
    public static void main(String[] args) {
        class Solution {
            public int[] buildArray(int[] nums) {
                int n = nums.length;
                int[] ans = new int[n];
                for(int i = 0; i < n; i++){
                    ans[i] = nums[nums[i]];
                }
                return ans;
            }
        }

    }
}