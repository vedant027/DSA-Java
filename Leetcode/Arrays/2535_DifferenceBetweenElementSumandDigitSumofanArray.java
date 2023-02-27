public class DifferenceBetweenElementSumandDigitSumofanArray {
    public static void main(String[] args) {
        class Solution {
            public int differenceOfSum(int[] nums) {
                int elementsum=0, digitsum=0;
                int rem=0;

                    // Calculating the Element Sum
                for(int i=0; i<nums.length; i++){
                    elementsum += nums[i];

                    // Calculating the Digit Sum
                    if(nums[i] < 10)
                        digitsum += nums[i];
                    else{
                        while(nums[i] != 0){
                            rem = nums[i] % 10;
                            digitsum += rem;
                            nums[i] /= 10;
                        }
                    }
                }

                // Returning Difference between Element Sum and Digit Sum
                return Math.abs(elementsum - digitsum);
            }
        }
    }
}