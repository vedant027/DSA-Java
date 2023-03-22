public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        class Solution {
            public int[] smallerNumbersThanCurrent(int[] nums) {
                int n = nums.length;
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    int count = 0;
                    // Creating an array for counting smaller numbers
                    for (int j = 0; j < n; j++) {
                        if (nums[j] < nums[i])
                            count++;
                    }
                    arr[i] = count;
                }
                return arr;
            }
        }
    }
}
