public class JumpGame {
    public static void main(String[] args) {
        class Solution {
            public boolean canJump(int[] nums) {
                int n = nums.length;
                int reachableIndex = 0;

                for(int i=0; i<n; i++){
                    if(reachableIndex < i){
                        return false;
                    }
                    else {
                        reachableIndex = Math.max(reachableIndex, i + nums[i]);
                    }
                }
                return true;
            }
        }
    }
}
